package com.qaautomation.tools.reporting;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Which documented operations and response codes the suites actually exercised, measured from
 * calls.json (every call of every test) against the provider's OpenAPI document.
 */
public final class ContractCoverage {

  private static final Set<String> METHODS =
      Set.of("get", "post", "put", "patch", "delete", "options");

  /** One operation: documented codes and the ones seen. */
  public record Operation(String operation, List<String> documented, List<String> exercised) {
    public boolean called() {
      return !exercised.isEmpty();
    }
  }

  /** The whole picture. */
  public record Result(
      List<Operation> operations, int operationsCalled, int codesDocumented, int codesExercised) {}

  public static Result measure(Path openApi, List<Map<String, Object>> calls, String host) {
    JsonNode spec;
    try {
      spec = new ObjectMapper(new YAMLFactory()).readTree(openApi.toFile());
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
    List<Operation> operations = new ArrayList<>();
    for (Map.Entry<String, JsonNode> path : spec.path("paths").properties()) {
      for (Map.Entry<String, JsonNode> method : path.getValue().properties()) {
        if (!METHODS.contains(method.getKey())) {
          continue;
        }
        String op = method.getKey().toUpperCase(Locale.ROOT) + " " + path.getKey();
        List<String> documented = new ArrayList<>();
        method.getValue().path("responses").fieldNames().forEachRemaining(documented::add);
        Set<String> exercised = new TreeSet<>();
        for (Map<String, Object> call : calls) {
          String callOp = call.get("method") + " " + call.get("operation");
          if (op.equals(callOp) && host.equals(call.get("host")) && call.get("status") != null) {
            exercised.add(String.valueOf(call.get("status")));
          }
        }
        operations.add(
            new Operation(op, documented.stream().sorted().toList(), List.copyOf(exercised)));
      }
    }
    int called = (int) operations.stream().filter(Operation::called).count();
    int documentedCodes = operations.stream().mapToInt(o -> o.documented().size()).sum();
    int exercisedCodes =
        operations.stream()
            .mapToInt(o -> (int) o.exercised().stream().filter(o.documented()::contains).count())
            .sum();
    return new Result(operations, called, documentedCodes, exercisedCodes);
  }
}

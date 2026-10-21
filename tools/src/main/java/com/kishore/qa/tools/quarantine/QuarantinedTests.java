package com.kishore.qa.tools.quarantine;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Finds tests carrying the {@code quarantine} TestNG group, by reading the test sources (the same
 * IDs the evidence listener uses: {@code <fully.qualified.Class>#<method>}).
 */
public final class QuarantinedTests {

  private static final Pattern PACKAGE =
      Pattern.compile("^package\\s+([\\w.]+);", Pattern.MULTILINE);
  private static final Pattern CLASS = Pattern.compile("public\\s+(?:final\\s+)?class\\s+(\\w+)");
  private static final Pattern TEST_METHOD =
      Pattern.compile(
          "@Test\\((?<attrs>[^)]*?)\\)(?<between>[\\s\\S]*?)public\\s+void\\s+(?<name>\\w+)\\(");

  private QuarantinedTests() {}

  public static List<String> in(Path sourceRoot) {
    List<String> found = new ArrayList<>();
    try (Stream<Path> files = Files.walk(sourceRoot)) {
      for (Path file : files.filter(f -> f.toString().endsWith(".java")).toList()) {
        found.addAll(inSource(Files.readString(file)));
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
    return found;
  }

  public static List<String> inSource(String source) {
    Matcher pkg = PACKAGE.matcher(source);
    Matcher cls = CLASS.matcher(source);
    if (!pkg.find() || !cls.find()) {
      return List.of();
    }
    String className = pkg.group(1) + "." + cls.group(1);
    List<String> ids = new ArrayList<>();
    Matcher method = TEST_METHOD.matcher(source);
    while (method.find()) {
      if (method.group("attrs").contains("\"quarantine\"")
          && !method.group("between").contains("@Test")) {
        ids.add(className + "#" + method.group("name"));
      }
    }
    return ids;
  }
}

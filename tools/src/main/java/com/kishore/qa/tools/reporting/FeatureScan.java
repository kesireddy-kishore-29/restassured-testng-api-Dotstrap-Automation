package com.kishore.qa.tools.reporting;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/** Counts test methods per feature ID from the {@code @Feature} annotations in the sources. */
public final class FeatureScan {

  private static final Pattern FEATURE = Pattern.compile("@Feature\\(\\{?([^)}]*)\\}?\\)");
  private static final Pattern ID = Pattern.compile("FEAT-[A-Z0-9]+-\\d{2}");

  private FeatureScan() {}

  public static Map<String, Long> count(Path sources) {
    Map<String, Long> counts = new TreeMap<>();
    if (!Files.isDirectory(sources)) {
      return counts;
    }
    try (Stream<Path> files = Files.walk(sources)) {
      for (Path file : files.filter(f -> f.toString().endsWith(".java")).toList()) {
        countIn(Files.readString(file), counts);
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
    return counts;
  }

  static void countIn(String source, Map<String, Long> counts) {
    Matcher annotation = FEATURE.matcher(source);
    while (annotation.find()) {
      Matcher id = ID.matcher(annotation.group(1));
      while (id.find()) {
        counts.merge(id.group(), 1L, Long::sum);
      }
    }
  }
}

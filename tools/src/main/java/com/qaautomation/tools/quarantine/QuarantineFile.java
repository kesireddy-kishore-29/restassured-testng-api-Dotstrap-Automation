package com.qaautomation.tools.quarantine;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qaautomation.tools.shared.Json;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/** quarantine.json at the repository root. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record QuarantineFile(int schemaVersion, List<QuarantineEntry> entries) {

  public static QuarantineFile read(Path file) {
    return Files.exists(file)
        ? Json.read(file, QuarantineFile.class)
        : new QuarantineFile(1, List.of());
  }

  public QuarantineFile plus(List<QuarantineEntry> added) {
    List<QuarantineEntry> all = new ArrayList<>(entries == null ? List.of() : entries);
    all.addAll(added);
    return new QuarantineFile(1, all);
  }

  public List<QuarantineEntry> entriesOrEmpty() {
    return entries == null ? List.of() : entries;
  }
}

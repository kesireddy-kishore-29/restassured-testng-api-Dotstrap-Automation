package com.qaautomation.tools.shared;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/** Zips a folder (failure bundles are re-zipped after triage adds its files). */
public final class Zip {

  private Zip() {}

  public static void folder(Path source, Path zipFile) {
    try (OutputStream out = Files.newOutputStream(zipFile);
        ZipOutputStream zip = new ZipOutputStream(out);
        Stream<Path> files = Files.walk(source)) {
      for (Path file : files.filter(Files::isRegularFile).toList()) {
        zip.putNextEntry(new ZipEntry(source.relativize(file).toString().replace('\\', '/')));
        Files.copy(file, zip);
        zip.closeEntry();
      }
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot zip " + source, e);
    }
  }
}

package org.ensembleprogramming;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvReader {

  public static void main(String[] args) throws IOException {
    // prints out the CSV files to the console
    for (var lines : parseCsv(Path.of("csv/all.csv"))) {
      System.out.println(lines);
    }

    for (var lines : parseCsv(Path.of("csv/paper.csv"))) {
      System.out.println(lines);
    }
  }

  public static List<List<String>> parseCsv(Path path) throws IOException {
    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
    return lines.stream()
      .map(line -> List.of(line.split(";")))
      .toList();
  }

}

package org.ensembleprogramming;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Converter {

  public static void main(String[] args) throws IOException {
    List<List<String>> districts = CsvReader.parseCsv(Path
        .of("csv/all.csv"));
    System.out.println(districts);
    HashMap<String, String> map = new HashMap<>();
    for (List<String> district : districts) {
      map.put(district.get(0), district.get(1));
    }
    System.out.println(map);
    List<List<String>> collectionDates = CsvReader.parseCsv(Path
        .of("csv/paper.csv"));
    System.out.println(collectionDates);
    HashMap<String, List<String>> dateMap = new HashMap<>();
    for (List<String> collection : collectionDates) {
      dateMap.put(collection.get(0), Arrays.asList(collection.get(1).split(",")));
    }
    System.out.println(dateMap);
  }



}

package org.ensembleprogramming;

import java.io.IOException;
import java.nio.file.Path;
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
  }



}

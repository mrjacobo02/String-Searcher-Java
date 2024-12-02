package StringSearcher.src;

import java.util.ArrayList;
import java.util.List;

public class StringSearcher {
  
  public static void Main(String[] args) {

    FileParser fileParser = new FileParser(args[1]);
    List<String> data = new ArrayList<>();
    try {
      List<String> lines = fileParser.ReadFromFile();
      for (String line : lines) {
        if(line.contains(args[0])) {
          data.add(line);
        }
      }
    } catch(Exception e) {
      System.err.println(e);
    }

    for (String line : data) {
      System.out.println(line);
    }
  }
  
}

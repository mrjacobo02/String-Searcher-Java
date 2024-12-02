package StringSearcher.src;

import java.util.ArrayList;
import java.util.List;

public class StringSearcher {
  
  public static void Main(String[] args) {

    if (args.length != 3 && args[0] != "search") {
      System.out.println("Invalid input. Input should be of the format: search <pattern> <file>");
    } else {

      FileParser fileParser = new FileParser(args[2]);
      List<String> data = new ArrayList<>();
      try {
        List<String> lines = fileParser.ReadFromFile();
        for (String line : lines) {
          if(line.contains(args[1])) {
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
  
}

package StringSearcher.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
  private File file;

  public FileParser(String path) {
    file = new File(path);
  }

  public List<String> ReadFromFile() throws FileNotFoundException {
    if(!file.isFile()) {
      throw new FileNotFoundException("File " + file.getName() + "does not exist");
    }

    List<String> data = new ArrayList<>();

    Scanner myReader = new Scanner(file);
    while (myReader.hasNextLine()) {
      data.add(myReader.nextLine());
    }
    myReader.close();

    return data;
  }
}
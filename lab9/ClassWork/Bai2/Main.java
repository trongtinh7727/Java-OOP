import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String data = "";
    String pathname = "input.txt";

    //input
    try {
      File in = new File(pathname);
      Scanner sc = new Scanner(in);
      while (sc.hasNextLine()) {
        data += sc.next() + " ";
      }
    } catch (FileNotFoundException e) {
      System.out.println("Catch an error.");
    }

    data = data.trim().toUpperCase();
    pathname = "output.txt";

    // output
    try {
      FileWriter out = new FileWriter("out.txt");
      out.write(data);
      out.close();
    } catch (IOException e) {
      System.out.println("Catch an error.");
    }
  }
}

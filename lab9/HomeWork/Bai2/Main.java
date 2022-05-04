import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int sum = 0;
    String pathname = "input.txt";

    //input
    try {
      File file = new File(pathname);
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        sum += sc.nextInt();
        System.out.println(sum);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Catch an error.");
    }
    // output
    pathname = "output.txt";
    try {
      FileWriter out = new FileWriter(pathname);
      out.write(String.format("%d", sum));
      out.close();
    } catch (IOException e) {
      System.out.println("Catch an error.");
    }
  }
}

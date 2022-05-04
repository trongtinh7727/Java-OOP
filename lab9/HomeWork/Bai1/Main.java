import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  //Get specific files by extensions from a given folder.
  public static void getFiles(String dir, String pathname) {
    File file = new File(dir);
    String[] list = file.list(
      new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
          if (name.toLowerCase().endsWith(pathname)) {
            return true;
          } else {
            return false;
          }
        }
      }
    );
    for (String f : list) {
      System.out.println(f);
    }
  }

  //Check if a file or directory specified by pathname exists or not.
  public static boolean isExist(String pathname) {
    try {
      File file = new File(pathname);
      return file.exists();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  // Append text to an existing file.
  public static void append(String pathname, String text) {
    String data = "";
    //input
    try {
      File in = new File(pathname);
      Scanner sc = new Scanner(in);
      while (sc.hasNextLine()) {
        data += sc.nextLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println("Catch an error.");
    }

    //output
    try {
      FileWriter out = new FileWriter(pathname);
      out.append(data);
      out.append(text);
      out.close();
    } catch (IOException e) {
      System.out.println("Catch an error.");
    }
  }

  // Find the longest word in a text file.
  public static String longestW(String pathname) {
    String longest = "";
    String temp = "";
    //input
    try {
      File in = new File(pathname);
      Scanner sc = new Scanner(in);
      while (sc.hasNextLine()) {
        temp = sc.next();
        if (temp.length() > longest.length()) {
          longest = temp;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Catch an error.");
    }
    return longest;
  }

  public static void main(String[] args) {
    String dir = "../Bai1/";
    String pathname = ".class";
    getFiles(dir, pathname);
    System.out.println("Min.java is exist: " + isExist("Min.java"));

    //Check if given pathname is a directory or a file.
    try {
      pathname = "Main.java";
      File file = new File(pathname);
      if (file.isFile()) {
        System.out.printf("%s is a file", file.getAbsolutePath());
      } else if (file.isDirectory()) {
        System.out.printf("%s is a directory", file.getAbsolutePath());
      } else {
        System.out.printf(
          "%s is not a file or directory",
          file.getAbsolutePath()
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    append("out.txt", "alo");
    System.out.println("\nThe longest word: " + longestW("out.txt"));
  }
}

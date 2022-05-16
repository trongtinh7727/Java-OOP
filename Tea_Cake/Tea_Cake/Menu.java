import java.io.*;
import java.util.*;

public class Menu implements PrAction {

  private static Menu intance = null;
  private ArrayList<Product> menuList;

  private Menu(String path) {
    menuList = readProduct(path);
  }

  public static Menu getMenu() {
    if (intance == null) {
      intance = new Menu("product.txt");
    }
    return intance;
  }

  // read product from file
  public ArrayList<Product> readProduct(String path) {
    ArrayList<Product> Pro = new ArrayList<>();
    String line;
    String[] data;
    try {
      File proFile = new File(path);
      Scanner sc = new Scanner(proFile);
      while (sc.hasNextLine()) {
        line = sc.nextLine();
        data = line.split(",");
        if (data[0].charAt(0) == 'D') {
          Pro.add(
            new Drink(
              data[0],
              data[1],
              Double.parseDouble(data[2]),
              Double.parseDouble(data[3])
            )
          );
        } else {
          Pro.add(
            new Food(
              data[0],
              data[1],
              Double.parseDouble(data[2]),
              Double.parseDouble(data[3])
            )
          );
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found!!");
      e.printStackTrace();
    }
    return Pro;
  }

  public ArrayList<Product> getMenuList() {
    return menuList;
  }

  public Product getProduct(int index) {
    return menuList.get(index);
  }

  public boolean addProduct(Product p) {
    double n = p.getNumberOf();
    if (n < 0) {
      return false;
    }
    for (Product product : menuList) {
      if (product.getPrName().equalsIgnoreCase(p.getPrName())) {
        product.addNumberOf(n);
        return true;
      }
    }
    menuList.add(p);
    return true;
  }

  public boolean removeProduct(String prName) {
    for (Product product : menuList) {
      if (product.getPrName().equalsIgnoreCase(prName)) {
        menuList.remove(product);
        return true;
      }
    }
    return false;
  }

  public void printMenu() {
    int i = 1;
    System.out.printf("STT\tTen\tGia\tKho\n");
    for (Product proDuct : menuList) {
      System.out.printf(
        "%d\t%s\t%f\t%f\n",
        i++,
        proDuct.getPrName(),
        proDuct.getPrPrice(),
        proDuct.getNumberOf()
      );
    }
    System.out.println("0. Print bill.");
  }
}

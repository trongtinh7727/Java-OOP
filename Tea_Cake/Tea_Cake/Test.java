import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Menu menu = Menu.getMenu();

    Customer tinh = new Customer("Lover", "7727", "Dong Nai", 500);
    tinh.setBill("B01");
    int index;
    double n;
    Scanner sc = new Scanner(System.in);
    do {
      menu.printMenu();
      System.out.println("Chose an product");
      index = sc.nextInt();

      System.out.println("Numbers: ");
      n = sc.nextDouble();
      Product p;
      if (menu.getProduct(index - 1) instanceof Food) {
        p = new Food((Food) menu.getProduct(index - 1), n);
      } else {
        p = new Drink((Drink) menu.getProduct(index - 1), n);
      }
      tinh.getBill().addProduct(p);
      System.out.println("Print bill?");
      System.out.println("0. Yes        1. No");
      index = sc.nextInt();
    } while (index != 0);
    System.out.println("Your bill:");
    tinh.printBill();
    System.out.println("Total: " + tinh.total());
    // menu.printMenu();
  }
}

import java.util.Scanner;

public class Lab1Bai14 {

    public static void menu() {
        System.out.println("------MENU-----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");
    }

    public static void calMoney(int index) {

        double money;

        Scanner sc = new Scanner(System.in);

        int price[] = { 2, 3, 5, 5 };

        if (index == 5) {
            System.out.println("Machine is shutting down.");
        } else if (index > 5) {
            System.out.println("Please enter the valid number.");
        } else {
            System.out.printf("The price of Coca is: %d$. please enter the amount of money:\n", price[index - 1]);
            money = sc.nextDouble();

            if (money >= price[index - 1]) {
                System.out.printf("Your change is %.2f$.\n", money - price[index - 1]);
            } else {
                System.out.println("Not enough money to buy this item. Please select again.");
            }
        }
    }

    public static void main(String[] args) {
        int index;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Please enter the number:");
            index = sc.nextInt();
            calMoney(index);

        } while (index != 5);
    }
}

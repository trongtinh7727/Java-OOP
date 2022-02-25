import java.util.Scanner;

public class lab1_bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height:");

        double height = sc.nextDouble();

        System.out.println("Enter base: ");

        double base = sc.nextDouble();

        double are = 0.5 * base * height;

        System.out.printf("Are: %f",are);
        sc.close();
    }

}

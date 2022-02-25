import java.util.Scanner;

public class lab1_bai3_7 {

    // Exercise 3
    public static int division(int a, int b) {
        return a % b;
    }

    // Exercise 4
    public static double tempF(double t) {
        return 1.8 * t + 32;
    }

    public static double tempC(double f) {
        return (f - 32) / 1.8;
    }

    // Exercise 5
    public static boolean isLeapYear(int y) {
        if (y % 100 == 0 && y % 400 == 0) {
            return true;
        }
        if (y % 4 == 0 && y % 100 != 0) {
            return true;
        }
        return false;
    }

    // Exercise 6
    private static int findMin2(int a, int b) {
        return a > b ? b : a;

    }

    public static int findMind3(int a, int b, int c) {

        return findMin2(a,findMin2(b, c));
    }

    // Exercise 7
    public static boolean checkCharacter(String s) {
        if (s.charAt(0) > 32 && s.charAt(0) < 127) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3.");
        System.out.print("\tEnter a: ");
        int a = sc.nextInt();
        System.out.print("\tEnter b: ");
        int b = sc.nextInt();
        System.out.println("\tThe result of remainder is " + division(a, b));

        System.out.println("4.");
        System.out.print("\tEnter the Celcius temperature: ");
        double t = sc.nextDouble();
        System.out.println("\tThe result of Fahrenheit to Celcius:" + tempF(t));
        System.out.print("\tEnter the Fahrenheit temperature: ");
        double f = sc.nextDouble();
        System.out.println("\tThe result of Celcius to Fahrenheit:" + tempC(f));

        System.out.println("5.");
        System.out.print("\tEnter the year: ");
        int y = sc.nextInt();
        if (isLeapYear(y)) {
            System.out.println("\tThis is a leap year");
        } else {
            System.out.println("\tThis isn't a leap year");
        }

        System.out.println("6.");
        System.out.print("\tEnter a: ");
        a = sc.nextInt();
        System.out.print("\tEnter b: ");
        b = sc.nextInt();
        System.out.print("\tEnter c: ");
        int c = sc.nextInt();
        System.out.println("\tThe minimum of this 3 number is " + findMind3(a, b, c));

        System.out.println("7.");
        System.out.print("\tEnter the character: ");
        sc.nextLine();
        String s = sc.nextLine();
        if (checkCharacter(s)) {
            System.out.println("\tThis is a alphanumeric");
        } else {
            System.out.println("\tThis is not a alphanumeric");
        }
        sc.close();
    }
}
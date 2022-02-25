import java.util.Scanner;

public class Lab1Bai3_7 {

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

        return findMin2(a, findMin2(b, c));
    }

    // Exercise 7
    public static boolean checkCharacter(String s) {
        if (s.charAt(0) > 32 && s.charAt(0) < 127) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 7;

        // Exercise 3
        System.out.println("Exercise 3:");
        System.out.println("The result of remainder is " + division(a, b));
        System.out.println();
        // Exercise 4
        System.out.println("Exercise 4:");
        double t = 30;
        double f = 40;
        System.out.println("The result of Fahrenheit to Celcius:" + tempF(t));
        System.out.println("The result of Celcius to Fahrenheit:" + tempC(f));
        System.out.println();
        // Exercise 5
        System.out.println("Exercise 5:");
        int year = 2003;
        if (isLeapYear(year)) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This isn't a leap year");
        }
        System.out.println();
        // Exercise 6
        System.out.println("Exercise 6:");
        System.out.println("The minimum of this 3 number is " + findMind3(a, b, c));
        System.out.println();
        // Exercise 7
        System.out.println("Exercise 7:");
        String s = "Hello word";
        if (checkCharacter(s)) {
            System.out.println("This is a alphanumeric");
        } else {
            System.out.println("This is not a alphanumeric");
        }

    }
}
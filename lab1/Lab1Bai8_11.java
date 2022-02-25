import java.util.Scanner;

public class Lab1Bai8_11 {

    // Exercise 8
    public static int cal1(int n) {
        int re = 0;
        for (int i = 1; i <= n; i++) {
            re += i;
        }
        return re;
    }

    public static int cal2(int n) {
        int re = 1;
        for (int i = 1; i <= n; i++) {
            re = re * i;
        }
        return re;
    }

    public static int cal3(int n) {
        int re = 0;
        for (int i = 0; i <= n; i++) {
            re = re + (int) Math.pow(2, i);
        }
        return re;
    }

    public static float cal4(int n) {
        float re = 0;
        for (int i = 1; i <= n; i++) {
            re += (float) 0.5 / i;
        }
        return re;
    }

    public static int cal5(int n) {
        int re = 0;
        for (int i = 1; i <= n; i++) {
            re += (int) Math.pow(i, 2);
        }
        return re;
    }

    // Exercise 9
    public static void hailStone(int n) {
        int t = n;
        do {
            if (n % 2 != 0) {
                t = 3 * n + 1;
                System.out.println(n + " is odd, so we take 3*n+1: " + t);
            } else {
                t = n / 2;
                System.out.println(n + " is even, so we take n/2: " + t);
            }
            n = t;
        } while (n != 1);
    }

    // Exercise 9
    public static int sumFirstAndLast(int lf) {
        int l = lf % 10;
        int f;
        do {
            f = lf / 10;
            lf = lf / 10;
        } while (lf > 9);
        return f + l;
    }

    // Exercise 10
    public static int countDigit(int cd) {
        int i = 0;
        do {
            cd = cd / 10;
            i++;
        } while (cd > 0);
        return i;
    }

    public static void main(String[] args) {
        
        // Exercise 8
        System.out.println("Exercise 8:");
        int n = 15;
        System.out.println("The result of 8a) : " + cal1(n));
        System.out.println("The result of 8b) : " + cal2(n));
        System.out.println("The result of 8c) : " + cal3(n));
        System.out.println("The result of 8d) : " + cal4(n));
        System.out.println("The result of 8e) : " + cal5(n));
       
        // Exercise 9
        System.out.println();
        System.out.println("Exercise 9:");
        int h = 12;
        hailStone(h);
  
        // Exercise 10
        System.out.println();
        System.out.println("Exercise 10:");
        int lf = 153;
        System.out.println("Sum of first and last digit:" + sumFirstAndLast(lf));

        // Exercise 11
        System.out.println();
        System.out.println("Exercise 11:");
        int cd = 12345;
        System.out.println("Number of digit:" + countDigit(cd));
    }
}

import java.util.Scanner;

public class lab1_bai8_11 {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number:");
        int n = sc.nextInt();
        System.out.println("The result of 8a) : " + cal1(n));
        System.out.println("The result of 8b) : " + cal2(n));
        System.out.println("The result of 8c) : " + cal3(n));
        System.out.println("The result of 8d) : " + cal4(n));
        System.out.println("The result of 8e) : " + cal5(n));
        System.out.println("Input your number to make Hailstone sequence:");
        int h = sc.nextInt();
        hailStone(h);
        System.out.println("Input your number to sum first and last digit:");
        int lf = sc.nextInt();
        System.out.println("Sum of first and last digit:" + sumFirstAndLast(lf));
        System.out.println("Input your number to count digit:");
        int cd = sc.nextInt();
        System.out.println("Number of digit:" + countDigit(cd));
    }
}

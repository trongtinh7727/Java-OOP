import java.util.Scanner;

public class Lab1Bai12_13 {
    public static int reverse(int n) {
        int p = 0;
        do {
            p = p * 10 + n % 10;
            n /= 10;
        } while (n > 0);
        return p;
    }

    public static Boolean isPalindrome(int n) {
        if (reverse(n) == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intNum = 1235;

        // Exercise 12
        System.out.println("Exercise 12:");
        System.out.printf("Reverse number: %d\n", reverse(intNum));

        // Exercise 13
        System.out.println();
        System.out.println("Exercise 13:");
        if (isPalindrome(intNum)) {
            System.out.printf("%d is palindrome ", intNum);
        } else {
            System.out.printf("%d is not palindrome ", intNum);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class lab1_Bai12_13 {
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

        int intNum;

        System.out.println("12. ");
        System.out.printf("\tEnter a integer number: ");
        intNum = sc.nextInt();
        System.out.printf("\tReverse number: %d\n", reverse(intNum));

        System.out.println("13. ");
        System.out.printf("\tEnter a integer number: ");
        intNum = sc.nextInt();
        if (isPalindrome(intNum)) {
            System.out.printf("\t%d is palindrome ", intNum);
        } else {
            System.out.printf("\t%d is not palindrome ", intNum);
        }
        sc.close();
    }
}

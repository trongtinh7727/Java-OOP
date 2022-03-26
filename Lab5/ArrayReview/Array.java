import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Array {

    public static int maxEven(int a[]) {
        if (a.length < 1) {
            return -1;
        }
        int maxEven = a[0];
        for (int i : a) {
            if (i > maxEven && i % 2 == 0) {
                maxEven = i;
            }
        }
        return maxEven;
    }

    public static int minOdd(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int minOdd = a[0];
        for (int i : a) {
            if (i < minOdd && i % 2 != 0) {
                minOdd = i;
            }
        }
        return minOdd;
    }

    public static int sumMEMO(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int sum = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int proOdd(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int pro = 1;
        for (int i : a) {
            pro *= i;
        }
        return pro;
    }

    public static int idxFirstEven(int a[]) {
        if (a.length < 1) {
            return -1;
        }
        for (int i : a) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int idxLastOdd(int a[]) {
        if (a.length < 1) {
            return -1;
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int [] input(int n){
        if (n<=0) {
            int a[] = new int[0];
            return a ;
        }
        int []res=new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < res.length; i++) {
            res[i]= sc.nextInt();
        }
        return res;
    }
    public static void main(String[] args) {
        int a [] = input(5);
        System.out.printf("Max even: %d\n",maxEven(a));
        System.out.printf("Min odd: %d\n",minOdd(a));
        System.out.printf("Sum of Memo: %d\n",sumMEMO(a));
        System.out.printf("Sum of even: %d\n",sumEven(a));
        System.out.printf("Product of odd: %d\n",sumEven(a));
        System.out.printf("First even: %d\n",idxFirstEven(a));
        System.out.printf("Last odd: %d\n",idxLastOdd(a));
    }
}
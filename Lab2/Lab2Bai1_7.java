
import java.util.Arrays;

public class Lab2Bai1_7 {

    // Ex1:
    public static int findMax(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    // Ex2:
    public static int findMin(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    // Ex3:
    public static int sumEven(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int sum = arr[0];
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Ex4:
    public static int countEmplement(int[] arr) {
        return arr.length;
    }

    // Ex5:
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int arr[]) {
        int d = 0;
        for (int element : arr) {
            if (isPrime(element)) {
                d++;
            }
        }
        return d;
    }

    // Ex6:
    public static int find(int[] arr, int k) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                res = i;
                break;
            }
        }
        return res;
    }

    // Ex7:
    public static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 2, 7, 88, 5 };

        System.out.println("Array: ");
        printArr(arr);

        // Ex1:
        System.out.println("Exercise 1:");
        System.out.printf("Max of array: %d\n\n", findMax(arr));

        // Ex2:
        System.out.println("Exercise 2:");
        System.out.printf("Min of array: %d\n\n", findMin(arr));

        // Ex3:
        System.out.println("Exercise 3:");
        System.out.printf("Sum of all even number: %d\n\n", sumEven(arr));

        // Ex4:
        System.out.println("Exercise 4:");
        System.out.printf("The numbers of arr: %d\n\n", countEmplement(arr));

        // Ex5:
        System.out.println("Exercise 5:");
        System.out.printf("Prime numbers: %d\n\n", countPrime(arr));

        // Ex6:
        System.out.println("Exercise 6:");
        System.out.printf("Index of \"2\": %d\n\n", find(arr, 2));

        // Ex7:
        System.out.println("Exercise 7:");
        System.out.printf("Array after square:\n");
        square(arr);
        printArr(arr);
    }

}

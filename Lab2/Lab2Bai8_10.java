import java.math.BigDecimal;
import java.util.Arrays;

public class Lab2Bai8_10 {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
    }

    // Ex8:
    public static BigDecimal findBigMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (BigDecimal bigDecimal : arr) {
            if (bigDecimal.intValue() > max.intValue()) {
                max = bigDecimal;
            }
        }
        return max;
    }

    // Ex9:
    public static int[] divisibleNumbers(int arr[], int k) {

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                j++;
            }
        }
        int[] result = new int[j];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    // Ex10:
    public static int nLargest(int[] arr, int n) {
        int max = arr[0], index = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (n == 1) {
            return max;
        } else {
            arr[index] = min;
            return nLargest(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 2, 7, 88, 5 };

       

        // Ex8:
        System.out.println("\nExercise 8:");
        BigDecimal[] arrB = { new BigDecimal(5), new BigDecimal(1), new BigDecimal(2), new BigDecimal(9),
                new BigDecimal(5) };
        System.out.println("BigDecimal object array:");
        for (BigDecimal bigDecimal : arrB) {
            System.out.printf("%d\t", bigDecimal.intValue());
        }
        BigDecimal max = findBigMax(arrB);
        System.out.printf("\nMax of an BigDecimal object array: %d\n\n",
                max.intValue());
        // Ex9:
        System.out.println("Array: ");
        printArr(arr);

        System.out.println();
        System.out.println("Exercise 9:");
        System.out.printf("The elements which divisible by 2:\n");
        printArr(divisibleNumbers(arr, 2));

        // Ex10:
        System.out.println("\nExercise 10:");
        System.out.println("Array:");
        printArr(arr);
        System.out.printf("The third largest element in array: %d\n", nLargest(arr, 3));
    }

}

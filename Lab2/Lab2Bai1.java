public class Lab2Bai1 {

    //ex1:
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //ex2:
    public static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //ex3:
    public static int sumEven(int arr[]) {
        int sum = arr[0];
        for (int i = 1; i < arr.lenght; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    //ex4:

    //ex5:
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}

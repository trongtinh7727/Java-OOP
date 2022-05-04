

public class Calculator {
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            ArithmeticException error = new ArithmeticException("divide by zero");
            throw error;
        } else
            return (double) a / b;
    }

    public static int multiply(int a, int b) throws NumberOutOfRangeException {
        if (a > Math.abs(1000) && b > Math.abs(1000)) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        } else {
            return a * b;
        }
    }
}
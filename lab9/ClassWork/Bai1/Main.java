public class Main {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            System.out.printf("%d / %d = %f",a,b,Calculator.divide(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }

        a = 5000;
        b= 10000;
        try {
            System.out.printf("%d * %d = %d",a,b,Calculator.multiply(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

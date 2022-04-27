import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> X = new Vector<>();
        Vector<Integer> Y = new Vector<>();
        for (int i = 0; i < 10; i++) {
            X.add(i);
        }

        for (Integer integer : X) {
            Y.add(2*integer*integer+1);
        }
        System.out.println("Vector X:");
        System.out.println(X);
        System.out.println("Vector y:");
        System.out.println(Y);
    }
}
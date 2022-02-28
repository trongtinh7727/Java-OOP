import java.util.*;

public class ApproximatePI {
    public static void main(String[] args) {
        int nTerms, sign = 1, denom = 1;
        double pi = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        nTerms = sc.nextInt();
        for (int i = 0; i < nTerms; i++) {
            pi += 4.0 / denom * sign;
            sign *= -1;
            denom += 2;
        }
        System.out.printf("PI = %.6f\n", pi);
        sc.close();
    }
}
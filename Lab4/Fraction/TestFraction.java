public class TestFraction {
    public static void main(String[] args) {
        Fraction a = new Fraction(5, 3);
        Fraction b = new Fraction(4, 2);
        Fraction res = new Fraction(a.add(b));

        System.out.printf("Fraction A = %s\n", a.toString());
        System.out.printf("Fraction B = %s\n", b.toString());
        b.reducer();
        System.out.printf("Fraction B reduced = %s\n", b.toString());
        System.out.printf("Fraction res = %s", res.toString());
    }
}

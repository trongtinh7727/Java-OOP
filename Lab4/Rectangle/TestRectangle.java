public class TestRectangle {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.setLength(5f);
        a.setWidth(3f);
        System.out.println(a.toString());
        System.out.printf("Area: %f\nPerimeter: %f", a.getArea(), a.getPerimeter());

    }
}

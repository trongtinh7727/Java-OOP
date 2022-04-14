public class Test04 {
    public static void main(String[] args) {
        Circle cir1 = new Circle(5, "blue", true);
        System.out.println("Circle:");
        System.out.println(cir1.getRadius());
        cir1.setRadius(4);
        System.out.println(cir1.toString());

        Rectangle rec = new Rectangle(5, 3);
        System.out.println("Rectangle:");
        System.out.println(rec.getArea());
        System.out.println(rec.toString());

        Square sq = new Square(4, "black", false);
        System.out.println(sq.getSide());
        sq.setSide(7);
        System.out.println(sq.getArea());
        System.out.println(sq.toString());
    }
}

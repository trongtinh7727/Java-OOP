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

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        
        Shape max = new Rectangle(0, 0);

        System.out.println("List area:");
        for (Shape s : shapes) {
            System.out.println(s.getArea());
            if (s.getArea() > max.getArea()) {
                max = s;
            }
        }
        System.out.printf("Max: %s\narea: %f",max.toString(),max.getArea());

    }
}

public class Circle extends Shape {
    
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0f;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override

    public boolean equals(Shape s){
        Circle temp = (Circle) s;
        if (temp.radius == this.radius) {
            return true;
        }
        return false;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    public String toString(){
        return String.format("Circle[color = %s, filled = %b, radius = %f]", super.color,super.filled, this.radius);
    }

}

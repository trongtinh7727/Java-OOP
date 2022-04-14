public class Circle extends Shape {
    
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0f;
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

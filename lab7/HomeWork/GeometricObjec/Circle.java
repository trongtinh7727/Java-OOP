public class Circle implements GeometricObject{
    protected double radius;

    public Circle(){
        this.radius = 0.0;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 3.14*2.0*this.radius;
    }

    public String toString(){
        return String.format("Circle[radius: %.2f]", this.radius);
    }
}

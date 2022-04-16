public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        this.width = 0.0;
        this.length = 0.0;
    }

    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter(){
        return 2.0*(this.width+this.length);
    }

    public String toString(){
        return String.format("Rectangle [color: %s, length: %f, width: %f]", super.getColor(),this.length,this.width);
    }
}

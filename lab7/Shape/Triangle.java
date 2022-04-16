public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(){
        this.base = 0.0;
        this.height = 0.0;
    }

    public Triangle(double base, double height,String color){
        super(color);
        this.base =base;
        this.height = height;
    }

    public double getArea(){
        return 0.5*base*height;
    }

    @Override
    public String toString() {
        return String.format("Triangle[color: %s, base: %f, height: %f]", super.getColor(),this.base,this.height);
    }
}

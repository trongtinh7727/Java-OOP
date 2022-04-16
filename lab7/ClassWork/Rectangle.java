public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Shape s){
        Rectangle temp = (Rectangle) s;
        if (this.length == temp.length && this.width == temp.width) {
            return true;
        }
        return false;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return (this.width+this.length)*2.0;
    }

    public String toString (){
        return String.format("Rectangle[color = %s, filled = %b, width = %f, length = %f]", super.color,super.filled,this.width,this.length);
    }

}

public class Rectangle {
    private float width = 1.0f;
    private float length = 1.0f;

    public Rectangle(){}

    public Rectangle(float width, float length){
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public float getLength() {
        return this.length;
    }

    public float getArea() {
        return this.length * this.width;
    }

    public float getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length+"]";
    }

}

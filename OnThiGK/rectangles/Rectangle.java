public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color,  double wid, double len){
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public Rectangle(String name, String color, int wid, int len){
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

    public void setName(String name){
        this.name = name;    
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }

    public String getType(){
        double area = this.width * this.length;
        if (area >= 10) {
            return "A";
        } else {
            if (area > 5) {
                return "B";
            }
        }
        return "C";
    }
	
	public boolean isSquare(){
        return Math.abs(this.width-this.length) < 1e-6;
    }

    public double calDiagonalLine(){
        return Math.sqrt(this.width*this.width + this.length*this.length);
    }

    public Rectangle resize(double rate){
         return new Rectangle(this.name, this.color,
                                this.width * rate, this.length * rate);
    }

    public String toString(){
        return "Rectangle["+name+", "+length+", "+width+", "+", "+getType()+"]";
    }
}
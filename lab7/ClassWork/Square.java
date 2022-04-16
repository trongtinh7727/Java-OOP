public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double width){
        this.setSide(width);
    }

    public void setLength(double length){
        this.setSide(length);
    }
    
    public String toString(){
        return String.format("Square[color = %s, filled = %b, side = %f]", super.getColor(),super.isFilled(),this.getSide());
    }
}

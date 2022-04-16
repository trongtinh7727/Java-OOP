public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(){
        super();
    }

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.setRadius(super.getRadius()*percent/100.0);
    }
    public String toString(){
        return String.format("Circle[radius: %.2f]", this.radius);
    }
}

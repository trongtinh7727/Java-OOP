import java.util.ArrayList;

public class Main {
    public static double distance(Point a){
        double dist  = Math.sqrt(a.getX()*a.getX()+a.getY()*a.getY());
        return dist;
    }
    public static void main(String[] args) {
        ArrayList <Point> circle = new ArrayList<>();
        circle.add(new Point(0.1, 0.5));
        circle.add(new Point(0.1, 0.3));
        circle.add(new Point(0.1, 0.4));
        circle.add(new Point(0.1, 0.01));
        circle.add(new Point(0.1, 1));
        circle.add(new Point(0.1, 1.5));
        circle.add(new Point(0.1, 1.4));
        circle.add(new Point(0.5, 0.5));

        for (Point point : circle) {
            if (distance(point) <1) {
                System.out.println(point);
            }
        }
    }
}

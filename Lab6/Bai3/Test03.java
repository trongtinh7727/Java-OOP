public class Test03 {
    public static void main(String[] args) {
       Point2D a = new Point2D(1, 3);
       Point3D b = new Point3D(1, 0, 7);
       System.out.printf("A:\n%s\n",a.toString());
       a.setXY(5,5);
       System.out.println(a.toString());
       System.out.printf("B:\n%s\n",b.toString());
       b.setXY(5,5);
       b.setXYZ(5f,3.5f,4f);
       System.out.println(b.toString());
    }
}

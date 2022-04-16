public class Test {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(10);
        System.out.println(circle);
        circle.resize(50);
        System.out.printf("Resize 50%% : %s",circle.toString());
    }
}

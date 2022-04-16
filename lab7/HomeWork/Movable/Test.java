public class Test {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(0, 0, 2, 2,3);
        System.out.println("Start:");
        System.out.println(movableCircle.toString());
        movableCircle.moveDown();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        System.out.println("Moved:");
        System.out.println(movableCircle.toString());
    }
}

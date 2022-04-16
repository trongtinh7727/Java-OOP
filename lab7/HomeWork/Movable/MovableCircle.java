public class MovableCircle implements Movable {
    int radius;
    MovablePoint center = new MovablePoint();

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("MovableCircle[Center(x: %d, y: %d), radius: %d]", center.x, center.y, this.radius);
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();

    }

    public void moveRight() {
        center.moveRight();
    }

    public void moveLeft() {
        center.moveLeft();
    }
}

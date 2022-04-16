public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint() {
        this.x = 0;
        this.y = 0;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        
    }

    @Override
    public String toString(){
        return String.format("MovablePoint[(x: %d, y: %d)-(xSpeed: %d, ySpeed: %d)]", this.x,this.y,this.xSpeed,this.ySpeed);
    }

    public void moveUp(){
        this.y+=this.ySpeed;
    }
    public void moveDown(){
        this.y = this.y - this.ySpeed;
    }

    public void moveLeft(){
        this.x-=this.xSpeed;
    }

    public void moveRight(){
        this.x+=this.xSpeed;
    }
}

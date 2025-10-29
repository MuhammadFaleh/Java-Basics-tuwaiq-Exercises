public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        setX(x);
        setY(y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        this.y +=ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -=ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -=xSpeed;
    }

    @Override
    public void moveRight() {
        this.x +=xSpeed;
    }
}

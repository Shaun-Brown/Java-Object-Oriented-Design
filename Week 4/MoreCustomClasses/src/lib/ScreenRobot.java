package lib;

public class ScreenRobot {

    private int x, y, direction;

    public ScreenRobot() {
        x = 0;
        y = 0;
        direction = 0;
    }

    public ScreenRobot(int x, int y, int direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void forward(int distance){
        if(direction == 0) {
            this.x = x + distance;
        } else if (direction == 90) {
            this.y = y + distance;
        } else if (direction == 180) {
            this.x = x - distance;
        } else {
            this.y = y - distance;
        }
    }

    public void turnLeft(){
        this.direction += 90;
    }

    public void home(){
        this.x = 0;
        this.y = 0;
        direction = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection(){
        if (direction == 90) {
            return "UP";
        } else if (direction == 180) {
            return "LEFT";
        } else if (direction == 270) {
            return "DOWN";
        } else {
            return "RIGHT";
        }
    }

    public String getPosition() {
        return "[x:" + x + ", y:" + y + "] - Facing:" + this.getDirection();
    }

    public String toString() {
        return "ScreenRobot[x=" + x + ", y=" + y + ", direction=" + direction + "]";
    }
}

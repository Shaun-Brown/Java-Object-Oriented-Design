package robotEnumsOther;


public class ScreenRobot {
	private int x;
	private int y;
	private Direction facing;
	
	public ScreenRobot() {
		this(0, 0, Direction.RIGHT);
	}
	
	public ScreenRobot(int x, int y, Direction facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
	
	public void forward(int n) {
		switch (facing) {
			case UP : y+=n; break;
			case LEFT : x-=n; break;
			case DOWN : y-=n; break;
			case RIGHT : x+=n; break;
		}
	}
	
	public void turnLeft() {
		facing = facing.turnLeft();
	}
	
	public void turnRight() {
		facing = facing.turnRight();
	}
	
	public void setDirection(Direction facing) {
		this.facing = facing;
		//if you wanted a set direction method then
		//it's much nicer with enums as user can only
		//choose from the predefined set of constant values
	}
	
	public Direction getDirection() {
		return facing;
	}
	
	public String getCardinalDirection() {
		return facing.getCardinal();
	}
	
	public void home() {
		x=0;
		y=0;
		facing = Direction.RIGHT;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getPosition() {
		return "[x:" + x + ", y:" + y + "] - Facing:" + facing.getCardinal();
	}
	
	public String toString() {
		return "ScreenRobot[x=" + x + ", y=" + y + ", facing=" + facing + "]";
	}
	
}

package robotEnums;

public class ScreenRobot {
	
	//fields
	private int x;
	private int y;
	private Direction facing;
	
	
	//constructors
	public ScreenRobot() {
		this(0, 0, Direction.RIGHT);
	}
	
	public ScreenRobot(int x, int y, Direction facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
	
	
	//methods
	public void forward(int n) {
		switch (facing) {
			case UP : y+=n; break;
			case LEFT : x-=n; break;
			case DOWN : y-=n; break;
			case RIGHT : x+=n; break;
		}
	}
	
	public void turnLeft() {
		int newDirection = (facing.ordinal()+1) % 4;
		facing = Direction.values()[newDirection];

	}
	
	public void turnRight() {
		int newDirection = Math.floorMod(facing.ordinal()-1, 4);
		facing = Direction.values()[newDirection]; 
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
		return "[x:" + x + ", y:" + y + "] - Facing:" + facing;
	}
	
	public String toString() {
		return "ScreenRobot[x=" + x + ", y=" + y + ", facing=" + facing + "]";
	}
	
}

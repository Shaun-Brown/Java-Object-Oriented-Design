package robotEnumsOther;


public enum Direction {
	UP("North"), LEFT("West"), DOWN("South"), RIGHT("East");
	
	private String cardinal; //cardinal direction
	
	//make a static copy of all values for this Enum to ensure the
	//array is only created once, instead of each time it is referenced
	private static final Direction[] values = values();
	
	private Direction(String cardinal) {
		this.cardinal = cardinal;
	}
	
	public String getCardinal() {
		return cardinal;
	}
	
	public Direction turnLeft() {
		int newDirection = (this.ordinal()+1) % 4;
		return values[newDirection];

	}
	
	public Direction turnRight() {
		int newDirection = Math.floorMod(this.ordinal()-1, 4);
		return values[newDirection]; 
	}
}

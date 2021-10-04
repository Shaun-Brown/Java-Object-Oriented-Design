package robotEnumsOther;


public class ScreenRobotDemo {

	public static void main(String[] args) {
		ScreenRobot robot = new ScreenRobot(5, 5, Direction.DOWN);
		
		System.out.println(robot.toString());
		
		System.out.println("\nTurning robot right 10 times...");
		for (int i = 0; i < 10; i++) {
			robot.turnRight();
			System.out.println(robot.getPosition());
		}
		
		System.out.println("\nTurning robot left 10 times...");
		for (int i = 0; i < 10; i++) {
			robot.turnLeft();
			System.out.println(robot.getPosition());
		}
		
		System.out.println("\nSending robot home...");
		robot.home();
		System.out.println(robot.getPosition());
		
		System.out.println("\nSetting direction to DOWN");
		robot.setDirection(Direction.DOWN);
		System.out.println(robot.getPosition());
		
		System.out.println("\nMoving robot forward 10...");
		robot.forward(10);
		System.out.println(robot.getPosition());
		
		
	
	}

}

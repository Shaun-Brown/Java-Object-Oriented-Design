package screenRobots.src.simpleRobot;

import simpleRobot.ScreenRobot;

import java.util.Scanner;


public class ScreenRobotDemo {

	public static void main(String[] args) {
		ScreenRobot robot = new ScreenRobot();
		System.out.println(robot.toString());
		robot.forward(10);
		System.out.println(robot.toString());
		robot.turnLeft();
		robot.forward(5);
		System.out.println(robot.toString());
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("\nMenu\n-----\nforward\nrotate\nhome\nexit\n-----\n");
			input = sc.next();

			switch (input) {
				case "forward" -> {
					System.out.println("Foward by?");
					robot.forward(sc.nextInt());
				}
				case "rotate" -> robot.turnLeft();
				case "home" -> robot.home();
				case "exit" -> System.out.println("Exiting...");
				default -> System.out.println("Invalid command!");
			}
 			
			System.out.println(robot.getPosition());
			
			
		} while (!input.equals("exit")); 
		
		sc.close();
		
	}

}

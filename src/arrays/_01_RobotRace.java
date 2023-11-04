package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		int y = 500;
		int x = 100;
		int w = -1;
		boolean isRacing = true; 
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i=0;i < robots.length; i++) {
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i] = new Robot();
			robots[i].setY(y);
			robots[i].setX(x);
			//robots[i].setAngle(90);
			x += 100;
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		while(isRacing == true) {
			//5. use another for loop to iterate through the array and make each robot move 
			for (int i=0;i < robots.length; i++) {
				//   a random amount less than 50.
				int random = rand.nextInt(50);
				if (robots[i].getY() < 0) {
					w = i;
					isRacing = false;
					break;
				}
				else {
					robots[i].move(random);
				}
			}
		}
		//7. declare that robot the winner and throw it a party!
		System.out.println("robot " + w +  " reached the top first!");
		//8. try different races with different amounts of robots.
		// No.
		//9. make the robots race around a circular track.
		// just set the things to a 360 thing with if and else statements
	}
}
/// Nothing Else to work on here.

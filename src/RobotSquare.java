import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot r = new Robot();
		r.penDown();
		r.setSpeed(100);

		// 3. Put the robot's pen down

		// 6. Make the robot move as fast as possible

		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			r.setPenWidth(200);
			r.setRandomPenColor();

			// 2. Move your robot 200 pixels
			r.move(200);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			r.turn(90);
		}
		r.move(200);
		r.turn(45);
		r.move(150);
		r.turn(90);
		r.move(150);
		r.sparkle();
	}
}

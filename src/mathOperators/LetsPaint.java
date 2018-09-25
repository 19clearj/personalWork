package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double GALLON = 150.0; 
		final double HEIGHT = 8.0; 
		double width = 0.0;
		double length = 0.0;
		double areaofwalls = 0.0;
		double gallonsofpaint = 0.0;
		System.out.println("What is the length of the walls?");
		length = input.nextDouble();
		System.out.println("What is the width of the walls?");
		width = input.nextDouble();
		System.out.println("Height of room:" + HEIGHT);
		System.out.println("Length of room:" + length);
		System.out.println("Width of room:" + width);
		areaofwalls= (2*HEIGHT*length) + (2*HEIGHT*width);
		System.out.println("The area of the walls in the room is " + areaofwalls);
		gallonsofpaint = areaofwalls/150;
		System.out.println("You need " + gallonsofpaint + " gallons of paint to paint the walls of the room.");
		
		
		
		
	}

}

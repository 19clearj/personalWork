package mathOperators;
import java.util.Scanner;
public class areaOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 0.0;
		double volume = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius (in inches) of the sphere?");
		 radius = input.nextInt();
		volume = (4.0/3.0)*Math.PI*radius*radius*radius;
		System.out.println("The area of the sphere is " + volume + " inches^3.");
	}

}

package mathOperators;

import java.util.Scanner;

public class areOfACircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 0.0;
		double area = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radies (in inches) of the circle?");
		 radius = input.nextDouble();
		area = 2 * 3.14 * radius * radius;
		System.out.println("The area of the circle is " + area + " inches^2.");
	}

}

package decisions;

import java.util.Scanner;

import oop.RightTriangle;

public class DoWhileTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		RightTriangle bob = new RightTriangle();
		System.out.println("Enter the length of the base of a triangle: ");
		bob.setBase(input.nextDouble());
		double base = bob.getBase();
		System.out.println("Enter a the height of a triangle: ");
		bob.setHeight(input.nextDouble());

		RightTriangle fred = new RightTriangle();
		System.out.println("Enter the length of the base of another triangle:");
		fred.setBase(input.nextDouble());
		System.out.println("Enter a the height of another triangle: ");
		fred.setHeight(input.nextDouble());
		do {

			double area1 = bob.area();
			double area2 = fred.area();
			if (area1 > area2) {
				System.out.println("The first triangle has the largest area and the area is " + area1);
			}else{
			System.out.println("The second triangle has the largest area and the area is " + area2);
			}
		} while (bob.getBase() != -1);
		System.out.println("Enter the length of the base of a triangle: (enter -1 to stop)");
		bob.setBase(input.nextDouble());
		
	}

}

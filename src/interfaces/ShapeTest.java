package interfaces;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the Rectangle?");
		int length = input.nextInt();
		System.out.println("What is the width of the Rectangle?");
		int width = input.nextInt();
		Shape bob = new Rectangle(length, width);
		System.out.println("The area of the rectangle: " + bob.area());
		System.out.println("Tthe perimeter of the rectangle: " + bob.perimeter());
		System.out.println("What is the radius of the circle");
		int r = input.nextInt();
		Shape joe = new Circle(r);
		System.out.println("The area of the circle: " + joe.area());
		System.out.println("Tthe perimeter of the circle: " + joe.perimeter());

	}

}

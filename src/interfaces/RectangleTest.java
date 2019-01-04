package interfaces;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Rectangle jack = new Rectangle();
		System.out.println("What is the length of the Rectangle?");
		int length = input.nextInt();
		System.out.println("What is the width of the Rectangle?");
		int width = input.nextInt();
		Shape bob = new Rectangle(length, width);
		System.out.println("The area of the rectangle: " + bob.area());
		System.out.println("Tthe perimeter of the rectangle: " + bob.perimeter());
		jack.setWidth(20);
		jack.setLength(jack.getWidth()/5);
		System.out.println("The area of the rectangle: " + jack.area());
		System.out.println("Tthe perimeter of the rectangle: " + jack.perimeter());

	}
}

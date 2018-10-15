package oop;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		Rectangle bob = new Rectangle();
		System.out.println("What is the length of the rectangle ?");
		 bob.setLength(input.nextDouble());
		System.out.println("What is the width of the rectangle?");
		 bob.setWidth(input.nextDouble());
		System.out.println("The area of the rectangle is " + bob.area());
		System.out.println("The perimeter of the rectangle is " + bob.perimeter());
	
		CircleClass fred = new CircleClass();
		System.out.println("What is the radius of the circle?");
		fred.setRadius(input.nextDouble());
		System.out.println("The area of the circle is " + fred.area());
		System.out.println("The perimeter of the circle is " + fred.circumference());
		
		RightTriangle billy = new RightTriangle();
		System.out.println("What is the base of the right triangle?");
		billy.setBase(input.nextDouble());
		System.out.println("What is the height of the right triangle");
		billy.setHeight(input.nextDouble());
		System.out.println("The area of the rectangle is " + billy.area());
		System.out.println("The perimeter of the rectangle is " + billy.perimeter());
		
		Trap guy = new Trap();
		System.out.println("What is the length of the first base of the isoceles trapezoid?");
		guy.setBase1(input.nextDouble());
		System.out.println("What is the length of the second base of the isoceles trapezoid?");
		guy.setBase2(input.nextDouble());
		System.out.println("What is the height of the isoceles trapezoid");
		guy.setHeight(input.nextDouble());
		System.out.println("What is the length of the legs of the isoceles trapezoid?");
		guy.setLeg(input.nextDouble());
		System.out.println("The area of the rectangle is " + guy.area());
		System.out.println("The perimeter of the rectangle is " + guy.perimeter());
	}

}

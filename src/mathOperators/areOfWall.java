package mathOperators;

import java.util.Scanner;

public class areOfWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 0;
		int width = 0;
		int area = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the wall?");
		 height = input.nextInt();
		System.out.println("What is the width of the wall?");
		 width = input.nextInt();
		area = height * width;
		System.out.println("The area of the wall is " + area + ".");
	}

}

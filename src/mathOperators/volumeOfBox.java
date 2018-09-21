package mathOperators;

import java.util.Scanner;

public class volumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 0;
		int width = 0;
		int length = 0;
		int volume = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length (in inches) of the base of the box?");
		 length = input.nextInt();
		System.out.println("What is the width (in inches) of the base of the box?");
		 width = input.nextInt();
		 System.out.println("What is the height (in inches) of the box?");
		 height = input.nextInt();
		volume = length * width * height;
		System.out.println("The volume of the box is " + volume + " inches^3.");
	}

}

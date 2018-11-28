package arrays;

import java.util.Random;

public class ArrayRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(7);
		final int rectangle = 100;
		Rectangle[] bob = new Rectangle[rectangle];
		int wMax1 = 56;
		int wMin1 = 10;
		int length = 20;
		int side1 = 0;
		int smallestrectanlge = 0;
		double smallest = 3136.0;
		int side2 = 0;
		for (int i = 0; i < rectangle; i++) {
			side1 = wMin1 + generator.nextInt(wMax1 - wMin1 + 1);
			side2 = wMin1 + generator.nextInt(wMax1 - wMin1 + 1);
			bob[i] = new Rectangle(side1, side2);
		}
		for (int i = 0; i < rectangle; i++) {
			int place = i +1;
			System.out.println("Rectangle " + place + ":");
			System.out.println("Length:" + bob[i].getLength());
			System.out.println("Width" + bob[i].getWidth());
			System.out.println("Area:" + bob[i].area());

		}
		for (int i = 0; i < rectangle; i++) {
			if (bob[i].area() < smallest) {
				smallest = bob[i].area();
				smallestrectanlge = i + 1;
				bob[0] = bob[i];
			}
		}
		System.out.println("The rectangle with the smallest area is rectangle number " + smallestrectanlge);
		System.out.println("The first rectangle in the array is: " + bob[0]);
	}

}

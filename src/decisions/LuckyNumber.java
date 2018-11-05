package decisions;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double number = 0.0;
		System.out.println("What is your age?");
		int age = input.nextInt();

		if (age < 18) {
			System.out.println("What is your weight?");
			int weight = input.nextInt();
			number = weight / 2;
			System.out.println("Your lucky number is " + number);
		} else {
			double height = input.nextDouble();
			System.out.println("What is your weight?");
			number = height * 5;
			System.out.println("Your lucky number is " + number);

		}

	}
}

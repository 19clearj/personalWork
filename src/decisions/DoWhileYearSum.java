package decisions;

import java.util.Scanner;

public class DoWhileYearSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// System.out.println("Enter a number: ");
		// double value = input.nextDouble();
		int numbers = 0;
		double sum = 0.0;
		do {
			System.out.println("Enter a number: ");
			double value = input.nextDouble();
			sum += value;
			numbers++;
		} while (sum < 2018);
		System.out.println("The amount of numbers you entered is " + numbers);
	}
}
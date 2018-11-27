package arrays;

import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int testScores = 5;
		double[] test = new double[testScores];
		double sum = 0.0;
		for (int counter = 0; counter < test.length; counter++) {
			System.out.println("Enter a test score: ");
			test[counter] = input.nextDouble();
			sum += test[counter];
		}
		System.out.println(sum);
	}

}

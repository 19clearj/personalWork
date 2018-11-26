package arrays;

import java.util.Scanner;

public class array5TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] test = new double[5];
		for (int counter = 0; counter < 5; counter++) {
			System.out.println("Enter a test score: ");
			test[counter] = input.nextDouble();

		}
		System.out.println(test[0]);
	}

}

package arrays;

import java.util.Scanner;

public class array25000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] test = new double[25000];
		for (int counter = 0; counter < 25000; counter++) {
			System.out.println("Enter a test score: ");
			test[counter] = input.nextDouble();

		}
		for (int counter = 24999; counter >= 0; counter--) {
			System.out.println(test[counter]);
		}
	}

}

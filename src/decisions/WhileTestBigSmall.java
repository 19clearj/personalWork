package decisions;

import java.util.Scanner;

public class WhileTestBigSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double test = 0.0;
		double biggest = 0.0;
		double smallest = 0.0;
		System.out.println("Enter a test score");
		test = input.nextDouble();
		biggest = test;
		smallest = test;
		while (test != 9999) {
			if (test > biggest) {
				biggest = test;
			}
			if (test < smallest) {
					smallest = test;
				}
		
			System.out.println("Enter a test score (enter 9999 to stop)");
			test = input.nextDouble();
		}
		System.out.println("Highest score is:" + biggest);
		System.out.println("Lowest score is: " + smallest);
	}
}

package decisions;

import java.util.Scanner;

public class WhileTestBigSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a test score");
		double test = input.nextDouble();
		double biggest = test;
		double smallest = test;
		while (test != 9999) {
			if (test > biggest) {
				biggest = test;
			} else {
				if (test < smallest) {
					test = smallest;
				}
			}
			System.out.println("Enter another test: (enter 9999 to stop)");
			test = input.nextDouble();
		}
		System.out.println("Highest score is:" + biggest);
		System.out.println("Lowest score is: " + smallest);
	}
}

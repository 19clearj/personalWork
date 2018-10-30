package decisions;

import java.util.Scanner;

public class DoWhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:   (enter 999 to stop)");
		double value1 = input.nextDouble();
		System.out.println("Enter another number:");
		double value2 = input.nextDouble();
		do {
			double sum = value1 + value2;
			System.out.println("Your sum is " + sum);
			System.out.println("Enter a number:   (enter 999 to stop)");
			value1= input.nextDouble();
		} while (value1 != 999);
		
	}

}

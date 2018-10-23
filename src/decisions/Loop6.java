package decisions;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int sum = 0;
		while (number != 999) {
		sum = sum + number;
		System.out.println("Please enter another number to add (999 to quit):");
		number = input.nextInt();
		}
		System.out.println("The sum of the numbers entered is: " + sum);
	}

}

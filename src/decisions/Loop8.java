package decisions;

import java.util.Scanner;

public class Loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = input.nextInt();
		double sum = 0;
		double average = 0.0;
		int enter = 0;
		while (number != 999) {
		sum = sum + number;
		enter ++;
		average = sum / enter;
		System.out.println("Please enter another number to add (999 to quit):");
		number = input.nextInt();
		}
		System.out.println("The average of the numbers entered is: " + average);
	}

}

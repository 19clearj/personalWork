package decisions;

import java.util.Scanner;

public class ForLoopCashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many items did you buy?");
		int items = input.nextInt();
		double costofitems = 0.0;
		for (int counter = 1; counter <= items; counter++) {
			System.out.println("What is the cost of your item?");
			costofitems += input.nextDouble();

		}
		System.out.println("The total cost of items is " + costofitems);
	}
}

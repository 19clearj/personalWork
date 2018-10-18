package decisions;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("Are you a senior? (true or false)");
		boolean answer = input.nextBoolean();
		if (answer == true && gpa>= 3.5) {
			System.out.println("Yes, you will graduate with honors!");
		}
		else {
			System.out.println("You cannot graduate with honors.");
			
		}
	}

}

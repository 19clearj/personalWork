package decisions;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test score average?");
		double test = input.nextDouble();
		System.out.println("What is your homework score average?");
		double work = input.nextDouble();
		System.out.println("True or false, your teacher is nice?");
		boolean answer = input.nextBoolean();
		if (answer == true) {
			if (test > work) {
				System.out.println("Your grade in the class will be " + test+ "%");
			} else {
				if (work > test) {
					System.out.println("Your grade in the class will be " + work + "%");
				}
			}
		} else {
			if (test > work) {
				System.out.println("Your grade in the class will be " + work+ "%");
			} else {
				if (work > test) {
					System.out.println("Your grade in the class will be " + test+ "%");
				}

			}
		}
	}
}

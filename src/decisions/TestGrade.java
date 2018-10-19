package decisions;

import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the score of your first test?");
		double test1 = input.nextDouble();
		System.out.println("What is the score of your second test?");
		double test2 = input.nextDouble();
		System.out.println("What is the score of your third test?");
		double test3 = input.nextDouble();
		double average = (test1 + test2 + test3) / 3;
		if (average < 69.5) {
			System.out.println("You have an F in the class");
		} else {
			if (average < 77.5) {
				System.out.println("You have an D in the class");
			} else {
				if (average < 84.5) {
					System.out.println("You have an C in the class");
				} else {
					if (average < 92.5) {
						System.out.println("You have an B in the class");
					} else {
						if (average >= 92.5) {
							System.out.println("You have an A in the class");
						}
					}

				}
			}
		}
	}

}

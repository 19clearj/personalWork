package decisions;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectanlge");
		double length = input.nextDouble();
		System.out.println("What is the width of the rectangle?");
		double width = input.nextDouble();

		System.out.println("Would you like to calcualte (1) perimeter or (2) area? (choose 1 or 2)");
		int answer = input.nextInt();
		if (answer == 1) {
			double perimeter = (2 * length) + (2 * width);
			System.out.println("The perimeter is " + perimeter);
		} else {
			double area = length * width;
			System.out.println("The area is " + area);
		}

		System.out.println("How old are you");
		double age = input.nextDouble();
		if (age <= 17) {
			System.out.println("You are not an adult");
		} else {
			System.out.println("You are an adult");
		}
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		double times = 1400 / weight;
		System.out.println("Your weight goes " + times + " into the heaviest man's weight");
		if (14000 % weight == 0) {
			System.out.println("You have won $100,000");
		}

		System.out.println("Choose a menu option: ");
		System.out.println("1. Salad ");
		System.out.println("2. Hotdog ");
		System.out.println("3. Cake ");
		System.out.println("4. Soup");
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.println("Happy");
		} else {
			if (choice == 2) {
				System.out.println("Angry");
			} else {
				if (choice == 3) {
					System.out.println("Sad");
				} else {
					if (choice == 4) {
						System.out.println("Confused");
					} else {
						if (choice != 1 || choice != 2 || choice != 3 || choice != 4) {
							System.out.println("You did not choose a valid menu option");
						}
					}
				}
			}

		}

	}
}

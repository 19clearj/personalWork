package decisions;

import java.util.Scanner;

public class PetsGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("How many pets do you have");
		double pets = input.nextDouble();
		System.out.println("How many cars can fit in your garage");
		double cars = input.nextDouble();
		System.out.println("you have at least 5 pets and can fit more than 3 cars is your garage . . ." + (pets>=5 || cars > 3));
	}

}

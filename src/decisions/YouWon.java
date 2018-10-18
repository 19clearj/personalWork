package decisions;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("how much money did you get on your 5th birdthday?");
		double money = input.nextDouble();
		double number = Math.sqrt(84.3);
		if (Math.abs(money - number) < 0.01) {
			System.out.println("You win a good prize");
		}
		else {
			System.out.println("You win a bad prize");
			
		}
	}

}

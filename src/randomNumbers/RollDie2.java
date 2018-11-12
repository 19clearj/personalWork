package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollDie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		Scanner input = new Scanner(System.in);
		int rolls = 0;
		int counter = 0;
		int min = 1;
		int max = 6;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("How many times will you roll the die?");
		rolls = input.nextInt();
		for (counter = 1; counter <= rolls; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				one++;
			}
			if (randomNum == 2) {
				two++;
			}
			if (randomNum == 3) {
				three++;
			}
			if (randomNum == 4) {
				four++;
			}
			if (randomNum == 5) {
				five++;
			}
			if (randomNum == 6) {
				six++;
			}
		}
		System.out.println("You rolled " + one + " ones.");
		System.out.println("You rolled " + two + " twos.");
		System.out.println("You rolled " + three + " threes.");
		System.out.println("You rolled " + four + " fours.");
		System.out.println("You rolled " + five + " fives.");
		System.out.println("You rolled " + six + " sixes.");
	}

}

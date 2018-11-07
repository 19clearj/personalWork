package randomNumbers;

import java.util.Random;
import java. util.Scanner;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		Scanner input = new Scanner(System.in);
		int sides= 0;
		int rolls = 0;
		int counter = 0;
		int min = 1;
		int max = 0;
		System.out.println("How many sides are on your die?");
		sides = input.nextInt();
		System.out.println("How many times will you roll the die?");
		rolls = input.nextInt();
		max = sides;
		for(counter = 1; counter<= rolls; counter ++){
			int randomNum = min +generator.nextInt(max - min + 1);
			System.out.println("For roll " + counter + ", you rolled a " + randomNum);
	}


}
}

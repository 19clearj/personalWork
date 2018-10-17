package decisions;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is the score of your first test");
		double test1 = input.nextDouble();
		System.out.println("What is the score of your second test?");
		double test2 = input.nextDouble();
		if (test1 > test2)
		{
			System.out.println("great job");
			System.out.println( "the difference of the test scores is " + (test1 - test2) );
		}
		System.out.println("Have a nice day");
	}
}

package inputExamples;

import java.util.Scanner;

public class InputAgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double height = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall are you in inches?");
		height = input.nextDouble();
		System.out.println("You are " + height + " inches tall." + '\n' );
		Double weight = 0.0;
		System.out.println("How much do you weigh in lbs?");
		weight = input.nextDouble();
		System.out.println("You weigh " + weight + " lbs.");
	}

}

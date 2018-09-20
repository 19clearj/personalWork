package inputExamples;

import java.util.Scanner;

public class InputLockerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber = 0;
		int secondnumber = 0;
		int thirdnumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number of your locker combination?");
		firstnumber = input.nextInt();
		System.out.println("What is the second number of your locker combination?" );
		secondnumber = input.nextInt();
		System.out.println("What is the third number of your locker combination");
		thirdnumber = input.nextInt();
		System.out.println("Your locker combination is " + firstnumber + "-" + secondnumber + "-" + thirdnumber);
	}

}

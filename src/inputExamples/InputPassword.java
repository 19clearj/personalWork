package inputExamples;

import java.util.Scanner;

public class InputPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber = 0;
		int secondnumber = 0;
		int thirdnumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a one-digit number: ");
		firstnumber = input.nextInt();
		System.out.println("Enter another one-digit number: " );
		secondnumber = input.nextInt();
		System.out.println("Enter a third one-digit number: ");
		thirdnumber = input.nextInt();
		System.out.println("Your possible passwords with these numbers are" + '\n' 
		+ firstnumber + secondnumber + thirdnumber + '\n' 
		+ secondnumber + firstnumber + thirdnumber + '\n'
		+ secondnumber + thirdnumber + firstnumber + '\n'
		+ thirdnumber + firstnumber + secondnumber + '\n'
		+ thirdnumber + secondnumber + firstnumber + '\n'
		+ firstnumber + thirdnumber + secondnumber + '\n');
	}

}

package inputExamples;

import java.util.Scanner;

public class InputFotuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = 0;
		int age = 0;
		int luckynumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		weight = input.nextInt();
		System.out.println("Enter your age:" );
		age = input.nextInt();
		System.out.println("What is your lucky number?" );
		luckynumber = input.nextInt();
		System.out.println("In the future...");
		System.out.println("I see...");
		System.out.println( + luckynumber + " years from now...");
		System.out.println( "You will be reside number " + age + weight + " at an old folks home.");
	}

}

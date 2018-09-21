package mathOperators;

import java.util.Scanner;

public class ageUntilYouCanVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int years = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		years = 18 - age; 
		System.out.println("You can vote in " + years + " years.");
	}

}

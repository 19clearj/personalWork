package mathOperators;

import java.util.Scanner;

public class ageOfThreeFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int friendone = 0;
		int friendtwo = 0;
		int friendthree = 0;
		int sumoffriendsages = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the age of one friend?");
		 friendone = input.nextInt();
		System.out.println("What is the age of your second friend?");
		 friendtwo = input.nextInt();
		 System.out.println("What is the age of your third friend?");
		 friendthree = input.nextInt();
		sumoffriendsages = friendone + friendtwo + friendthree;
		System.out.println("The sum of your three friends ages is " + sumoffriendsages + ".");
	}

}

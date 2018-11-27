package arrays;

import java.util.Scanner;

public class arrayFriendLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int amountNames = 20;
		String[] name = new String[amountNames];
		for (int counter = 0; counter < name.length; counter++) {
			System.out.println("Enter a friends name: ");
			name[counter] = input.nextLine();
		}
		System.out.println("Enter a letter: ");
		String letter = input.nextLine();
		char aLetter = letter.charAt(0);
		for (int i = 0; i < name.length; i++) {
			int length = name[i].length();
			char lastLetter = name[i].charAt(length - 1);
			if (lastLetter == aLetter) {
				System.out.println(name[i]);
			}

		}
	}

}

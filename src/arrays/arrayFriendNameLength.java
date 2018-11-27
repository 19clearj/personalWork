package arrays;

import java.util.Scanner;

public class arrayFriendNameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int amountNames = 5;
		String[] name = new String[amountNames];
		for (int counter = 0; counter < name.length; counter++) {
			System.out.println("Enter a friends name: ");
			name[counter] = input.nextLine();
		}
		System.out.println("Enter an integer number: ");
		int length = input.nextInt();
		for (int i = 0; i < name.length; i++) {
			int nLength = name[i].length();
			if (nLength == length) {
				System.out.println(name[i]);
			}

		}
	}

}

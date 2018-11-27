package arrays;

import java.util.Scanner;

public class arrayFriendName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int amountNames = 20; 
		String[] name = new String[amountNames];
		for (int counter = 0; counter < name.length; counter++) {
			System.out.println("Enter a friends name: ");
			name[counter] = input.nextLine();
		}
		for (int i = name.length - 1; i >= 0; i--) {
			System.out.println(name[i]);
		}
	}

}

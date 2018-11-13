package strings;

import java.util.Scanner;

public class LengthActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("The amount of characters in your sentenece is: " + sentence.length());
	}

}

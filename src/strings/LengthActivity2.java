package strings;

import java.util.Scanner;

public class LengthActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		int character = 0;
		for (int counter = 1; counter <= length; counter++) {
			System.out.println(sentence.charAt(character));
			character ++;
		}
	}

}

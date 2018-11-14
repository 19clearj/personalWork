package strings;

import java.util.Scanner;

public class StringActivitySen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int counter = 0;
		for (counter = 0; counter < sentence.length(); counter ++) {
			if (sentence.charAt(counter) != 'a' && sentence.charAt(counter) != ' ' ) {

				System.out.print(sentence.charAt(counter));
			}
		}
	}
}
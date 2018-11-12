package strings;

import java.util.Scanner;

public class CharActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("The first letter in the sentence is: " + sentence.charAt(0));
		System.out.println("The third letter in the sentence is: " + sentence.charAt(2));
		System.out.println(sentence);
	}

}

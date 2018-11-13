package strings;

import java.util.Scanner;

public class LowerCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		String lowersentence = sentence.toLowerCase();
		System.out.println(lowersentence);
		System.out.println(sentence);
	}

}

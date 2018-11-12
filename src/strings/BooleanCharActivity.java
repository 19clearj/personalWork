package strings;

import java.util.Scanner;

public class BooleanCharActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("The sentence contains 'Bob': " + sentence.contains("Bob"));
		// will output a boolean answer
	}

}

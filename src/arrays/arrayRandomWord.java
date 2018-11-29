package arrays;

import java.util.Random;
import java.util.Scanner;

public class arrayRandomWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner system = new Scanner(System.in);
		Random generator = new Random(6);
		System.out.println("Enter a sentence: ");
		String sentence = system.nextLine();
		String[] word = sentence.split(" ");
		System.out.println(word[+generator.nextInt(word.length)]);
	}

}

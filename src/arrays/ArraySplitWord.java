package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraySplitWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner system = new Scanner(System.in);
		Random generator = new Random(6);
		int total = 0;
		System.out.println("Enter a key word: ");
		String key = system.nextLine();
		System.out.println("Enter a sentence: ");
		String sentence = system.nextLine();
		String[] word = sentence.split(" ");
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i].charAt(0));
			if (word[i].equals(key) == true) {
				total++;
			}
		}
		System.out.println(total);

	}

}

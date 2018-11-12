package strings;

import java.util.Scanner;

public class StringAgeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Enter your name:");
		String name = input.nextLine();
		System.out.println("Your name is " + name + " and your age is " + age);
	}

}

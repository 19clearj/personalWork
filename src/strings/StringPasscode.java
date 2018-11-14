package strings;

import java.util.Scanner;

public class StringPasscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a passcode:");
		String passcode1 = input.next();
		System.out.println("Re-enter your passcode:");
		String verify = input.next();
		while (verify != passcode1) {
			if (passcode1.compareTo(verify) != 0) {
				System.out.println("Re-enter your passcode:");
				verify = input.next();
			}
		}
	}

}

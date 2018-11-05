package decisions;

import java.util.Scanner;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int factor = 1;
		for (factor = 1; factor <= 4; factor = factor + 1) {
			for (counter = 1; counter <= 5; counter = counter + 1) {
				System.out.print(factor * counter + "   ");
			}
			System.out.println();
		}
	}
}

package arrays;

import java.util.Scanner;

public class multiArrayClassActs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] bob = new String[4][3];
		for (int i = 0; i < bob.length; i++) {
			for (int x = 0; x < bob[0].length; x++) {
				System.out.println("Enter a name: ");
				bob[i][x] = input.nextLine();
			}
		}
		for (int i = 0; i < bob.length; i++) {
			for (int x = 0; x < bob[0].length; x++) {
				System.out.print(bob[i][x].length() + "     ");
				
			}
			System.out.println();
		}
	}
}

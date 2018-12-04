package arrays;

import java.util.Scanner;

public class multiPracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are there?");
		int students = input.nextInt();
		String[][] bob = new String[2][students];
		for (int i = 0; i < bob[0].length; i++) {

			for (int x = 0; x < bob.length; x++) {

				System.out.println("Enter a name: (First Last)");
				String name = input.nextLine();
				String first = name.substring(0, name.indexOf(" "));
				String last = name.substring(name.indexOf(" ") + 1, name.length());
				bob[i][x] = first;

			}
		}
	}
}

package arrays;

import java.util.Scanner;

public class multiPracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are there?");
		int students = input.nextInt();
		input.nextLine();
		String[][] bob = new String[2][students];
		for (int i = 0; i < 2; i++) {

			for (int x = 0; x < students; x++) {

				System.out.println("Enter a name: (First Last)");
				String name = input.nextLine();
				String first = name.substring(0, name.indexOf(" "));
				String last = name.substring(name.indexOf(" ") + 1, name.length());

				if (i == 0) {
					bob[x][i] = last;
				}
				if (i == 1) {

					bob[x][i] = first;
				}

			}
		}

		for (int x = 0; x < 2; x++) {

			for (int i = 0; i < students; i++) {
				System.out.println(bob[x][i]);
			}
		}
	}
}

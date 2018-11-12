package strings;

import java.util.Scanner;

public class CompareNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name1 = input.nextLine();
		System.out.println("Enter another name: ");
		String name2 = input.nextLine();
		if (name1.compareTo(name2) < 0) {
			System.out.println(name1 + " comes before " + name2);
		} else {
			System.out.println(name2 + " comes before " + name1);
		}
	}
}

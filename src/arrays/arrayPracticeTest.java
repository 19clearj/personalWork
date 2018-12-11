package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayPracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friend> friend = new ArrayList<Friend>();
		for (int x = 0; x < 2; x++) {
			System.out.println("Enter your friends age");
			int age = input.nextInt();
			input.nextLine();
			System.out.println("Enter your friends name");
			String name = input.nextLine();
			
			
			friend.add(new Friend(name, age));
		}
		for (int x = 1; x >= 0; x--) {
			int age = friend.get(x).getAge();
			int retire = 65 - age;
			String name = friend.get(x).getName();
			String last = name.substring(name.indexOf(" "), name.length());
			String first = name.substring(0, name.indexOf(" "));
			System.out.println(last + "," + first);
			System.out.print(retire);
		}
	}

}

package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * ArrayList<String> names = new ArrayList<String>(); names.add("Bob");
		 * names.add("Jane"); names.add(0, "Billy");
		 * System.out.println("Enter a name:"); names.add(input.nextLine());
		 * for(int x = 0; x <names.size(); x ++){
		 * System.out.println(names.get(x)); }
		 */

		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add( new Friend("Jack", 17));
		friends.add(new Friend("David", 54));
		friends.add(new Friend("Joey", 25));
		for (int x = 0; x < friends.size(); x++) {
			System.out.println(friends.get(x).getAge());
		}

	}

}

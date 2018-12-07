package arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class arrayListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		/*
		 * ArrayList<String> names = new ArrayList<String>(); names.add("Bob");
		 * names.add("Jane"); names.add(0, "Billy");
		 * System.out.println("Enter a name:"); names.add(input.nextLine());
		 * for(int x = 0; x <names.size(); x ++){
		 * System.out.println(names.get(x)); }
		 */
		/*
		 * ArrayList<Friend> friends = new ArrayList<Friend>(); friends.add( new
		 * Friend("Jack", 17)); friends.add(new Friend("David", 54));
		 * friends.add(new Friend("Joey", 25)); for (int x = 0; x <
		 * friends.size(); x++) { System.out.println(friends.get(x).getAge()); }
		 */
		/*
		ArrayList<Rectangle> rec = new ArrayList<Rectangle>(400);
		int min = 50;
		int max = 70;
		for (int x = 0; x < 400; x++) {
			int length = min + generator.nextInt(max - min + 1);
			int width = min + generator.nextInt(max - min + 1);
			rec.add(x, new Rectangle(length, width));
		}
		Rectangle save = rec.remove(0 + generator.nextInt(399 - 0 + 1));
		System.out.println(save.getLength());
		
		for (int i = 398; i >= 0; i--) {
			System.out.println(rec.get(i).area());

		}
		*/
		/*
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jane"); 
		names.add("Billy");
		names.add("Joey");
		names.add("Jack");
		String save = names.remove(0);
		String last = names.remove(names.size()-1);
		for(int x = 0; x < names.size(); x ++){
		System.out.println(names.get(x));
		}
		*/
		/*
		ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
		rec.add(new Rectangle());
		rec.add(new Rectangle());
		rec.add(new Rectangle());
		rec.add(new Rectangle());
		Rectangle last = rec.remove(rec.size()-1);
		rec.set(0, last);
		*/
		
	}
}

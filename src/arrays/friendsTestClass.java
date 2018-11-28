package arrays;

import java.util.Scanner;

public class friendsTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int friends = 3;
		Friend [] bob = new Friend[friends];
		for(int i = 0; i <friends; i ++){
			System.out.println("Enter the age of your friend: ");
			int age = input.nextInt();
			input.nextLine();
			System.out.println("Enter the name of your friend: ");
			String name = input.nextLine();
			bob[i] = new Friend(name, age);	
		}
		for(int x = friends-1; x >= 0; x--){
			System.out.println(bob[x].getName() + bob[x].getAge());
		}
	}

}

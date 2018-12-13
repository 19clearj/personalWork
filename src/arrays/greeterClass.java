package arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class greeterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Greeter bob = new Greeter();
		System.out.println("how many greeters would you like?");
		int amount = input.nextInt();
		ArrayList<Greeter>greets = new ArrayList<Greeter>();
		for(int x = 0; x <amount; x ++){
			greets.add(new Greeter());
		}
		for(Greeter differed : greets ){
			System.out.println(differed.getAge());
		}
		
	}

}

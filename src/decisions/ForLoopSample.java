package decisions;

import java.util.Scanner;

public class ForLoopSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		int number = input.nextInt();
		int counter = 0; 
		int sum = 0;
			for (counter = 1000; counter>= number; counter = counter-2){
				sum = sum + counter; 
		}
			System.out.println(sum);
		
		
		

	}
	}



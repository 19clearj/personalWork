package decisions;

import java.util.Scanner;

public class ForLoopClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many kids do you have in your class?");
		int kids = input.nextInt(); 
		double test = 0.0;
		double sum = 0.0; 
		double average = 0.0;
		for (int counter = 1; counter<= kids; counter = counter+1){
			System.out.println("Enter the test score of a student: ");
			test = input.nextDouble();
			sum += test; 
	}
		average = sum/ kids; 
		System.out.println("The average test score is " + average);
	}

}

package decisions;

import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an end number:");
		int number = input.nextInt();
		int count = 0;
		int sum = 0;
		while (count <= number) {
			count += 2;
			sum += count;
		}
		System.out.println("The sum is " + sum);
	
	}

}

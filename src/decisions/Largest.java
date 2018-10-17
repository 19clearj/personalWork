package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one intger");
		int int1 = input.nextInt();
		System.out.println("Enter a second integer");
		int int2 = input.nextInt();
		System.out.println("Enter a third integer");
		int int3 = input.nextInt();
		if (int1 > int2 && int1 > int3)
		{
			System.out.println("The first intger (" + int1 + ") is the largest");
		}
		if (int2 > int1 && int2 > int3)
		{
			System.out.println("The second intger (" + int2 + ") is the largest");
		}
		if (int3 > int2 && int3 > int1)
		{
			System.out.println("The third intger (" + int3 + ") is the largest");
		}
	}

}

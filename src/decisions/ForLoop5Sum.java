package decisions;
import java.util.Scanner;
public class ForLoop5Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0; 
		int sum = 0;
		for (counter = 1; counter<= 5; counter = counter+1){
			System.out.println("Enter a number");
			int number = input.nextInt();
			sum += number;

	}
		System.out.println("The sum of the number is " + sum);
	}

}

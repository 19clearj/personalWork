package decisions;

import java.util.Scanner;

public class WhileLoopRoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a four digit integer: ");
		int number = input.nextInt();
	while	(number != -1){
		int rounded = (number/10)*10;
		System.out.println(rounded);
		System.out.println("Enter an integer: (enter -1 to quit)");
		number= input.nextInt();
	}
	}

}

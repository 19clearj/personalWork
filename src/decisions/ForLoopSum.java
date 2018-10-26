package decisions;

import java.util.Scanner;

public class ForLoopSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0; 
		int sum = 0;
		for (counter = 1; counter<= 10; counter= counter+1){
			sum += counter;
			System.out.println(sum);

	}
	}

}

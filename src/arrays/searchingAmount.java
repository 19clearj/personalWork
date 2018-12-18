package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class searchingAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number = new int [100];
		Random generator = new Random(16);
		Scanner input = new Scanner (System.in);
		int min = 0;
		int max = 499;
		int amount = 0;
		boolean inThere = false;
		for( int x = 0; x< number.length; x ++){
			number[x]=(min + generator.nextInt(max - min + 1));
		}
		System.out.println("Enter an intger");
		int answer = input.nextInt();
		for(int x = 0; x<number.length; x ++){
			if(number[x]== answer){
				inThere = true;
				amount ++;
				
			}
		}
		if(amount > 0){
		System.out.println("Your integer is in the array " + amount + " time(s)");
		}
	}

}

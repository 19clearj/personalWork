package randomNumbers;

import java.util.Random;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int min= 1;
		int max = 13;
		int counter = 0;
		int threes = 0;
		for(counter = 1; counter<= 87; counter ++){
			int randomNum = min +generator.nextInt(max - min + 1);
			if (randomNum % 3 == 0){
				threes++;
			}
		}
		System.out.println("The total amount of multiples of threes is " + threes);
	}

}

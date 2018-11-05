package randomNumbers;

import java.util.Random;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int min= 26;
		int max = 43;
		int counter = 0;
		int kids = 0;
		for(counter = 1; counter<= 248; counter ++){
			int randomNum = min +generator.nextInt(max - min + 1);
			if (randomNum> 36){
				kids++;
			}
		}
		System.out.println("The amount of first graders over three feet tall is " + kids);
	}

}

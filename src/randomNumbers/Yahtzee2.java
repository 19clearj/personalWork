package randomNumbers;

import java.util.Random;

public class Yahtzee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int rolls = 0;
		int min = 1;
		int max = 6;
		int yahtzee = 0;
		int randomNum1 = 0;
		int randomNum2 = 0;
		int randomNum3 = 0;
		int randomNum4 = 0;
		int randomNum5 = 0;
		int randomNum6 = 0;
		int counter = 0;
		int smallest = 100;
		for (counter = 1; counter <= 100; counter++) {
			for (int counter2 = 0; counter2 == 0; counter = yahtzee)
				rolls++;
			randomNum1 = min + generator.nextInt(max - min + 1);
			randomNum2 = min + generator.nextInt(max - min + 1);
			randomNum3 = min + generator.nextInt(max - min + 1);
			randomNum4 = min + generator.nextInt(max - min + 1);
			randomNum5 = min + generator.nextInt(max - min + 1);
			randomNum6 = min + generator.nextInt(max - min + 1);
			if (randomNum1 == randomNum2 && randomNum2 == randomNum3 && randomNum3 == randomNum4
					&& randomNum4 == randomNum5 && randomNum5 == randomNum6) {
				yahtzee = 1;
				if(rolls == smallest){
					smallest = rolls;
				}
			}
		}
		System.out.println("It took " + smallest + " rolls to roll a yahtzee.");
	}

}

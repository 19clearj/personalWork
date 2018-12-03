package arrays;

import java.util.Random;

public class doubleArrayClassAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int min = 0;
		int max = 100;
		int sum = 0;
		int[][] numbers = new int[3][7];
		for (int x = 0; x < numbers.length; x++) {
			for (int i = 0; i < numbers[0].length; i++) {
				int randomRow = min + generator.nextInt(max - min + 1);
				numbers[x][i] = randomRow;
				sum += numbers[x][i];
			}
		}
		System.out.println(sum);
	}

}

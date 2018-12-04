package arrays;

import java.util.Random;

public class multiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random(5);
		int min = 0;
		int max = 50;
		int sum = 0;
		int[][][] numbers = new int[3][7][9];
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				for (int i = 0; i < numbers[0][0].length; i++) {
					int randomRow = min + generator.nextInt(max - min + 1);
					numbers[r][c][i] = randomRow;
					sum += numbers[r][c][i];
				}

			}
		}
		System.out.println(sum);
	}

}

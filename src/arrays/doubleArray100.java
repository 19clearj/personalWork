package arrays;

import java.util.Random;

public class doubleArray100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(6);
		int min = 0;
		int max = 100;
		int randomNum = min + generator.nextInt(max - min + 1);
		int[][] numbers = new int[14][9];
		for (int row = 0; row < numbers.length; row++) {
			for (int c = 0; c < numbers[0].length; c++) {
				int randomRow = min + generator.nextInt(max - min + 1);
				numbers[row][c] = randomRow;
				System.out.print(numbers[row][c] + "      ");

			}
			System.out.println();
		}

	}

}

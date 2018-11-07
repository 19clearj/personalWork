package randomNumbers;

import java.util.Random;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 0;
		int max = 1;
		int counter = 0;
		int heads = 0;
		int mostheads = 0;
		int leastheads = 100000;
		int counter2 = 0;
		for (counter = 1; counter <= 100; counter++) {
			for (counter2 = 1; counter2 <= 100000; counter2++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum == 1) {
					heads++;
				}
			}
			if (heads >= mostheads) {
				mostheads = heads;
			}
			if (heads <= leastheads) {
				leastheads = heads;
			}
			heads = 0;

		}
		System.out.println("The largest percentage of heads flipped waas " + (double) mostheads / 100000 + "%");
		System.out.println("The smallest percentage of heads flipped was " + (double) leastheads / 100000 + "%");
	}

}

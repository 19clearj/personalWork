package arrays;

import java.util.Random;

public class pileOjunk {
	private static int idNumber;
	Random generator = new Random();
	private int random;

	public pileOjunk() {
		int random = 10 + generator.nextInt(100 - 10 + 1);
		this.random = random;
		idNumber += 1;
	}
	public int getRandom(){
		return random;
	}

	public static int getSum(int x, int y) {
		return x + y;
	}

	public void setNum(int random) {
		this.random = random;
	}
}

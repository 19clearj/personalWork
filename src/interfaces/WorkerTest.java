package interfaces;

import java.util.ArrayList;
import java.util.Random;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker[] work = new Worker[100];
		Random generator = new Random();
		int smallest = 1000;
		int largest = 0;
		for (int x = 0; x < 100; x++) {
			work[x] = new Worker(generator.nextInt(60), generator.nextDouble() * 150);
		}
		for (Worker x : work) {

		}
	}

}

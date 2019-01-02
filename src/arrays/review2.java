package arrays;

import java.util.Random;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int[] bob = new int[487];
		int min = 1;
		int max = 6;
		int odd = 0;
		for (int x = 0; x < 487; x++) {
			int randomRoll = min + generator.nextInt(max - min + 1);
			bob[x] = randomRoll;
		}
		for (int x = 0; x < 487; x++) {
			if (bob[x]% 2 != 0){
				odd ++;
			}
		}
		double percentage = 0.0;
		percentage = 100 *(odd/487);
		System.out.println(odd);
		System.out.println("Percentage of odd rolls: " + percentage);
		for (int x = 486; x >= 0; x--) {
			System.out.println(bob[x]);
			}
	}

}

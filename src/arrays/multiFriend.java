package arrays;

import java.util.Random;

public class multiFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		Friend[][] bob = new Friend[18][5];
		int max = 100;
		int min = 0;
		for (int i = 0; i < bob.length; i++) {
			for (int x = 0; x < bob[0].length; x++) {
				bob[i][x] = new Friend(); 
			}
		}
		for (int i = 0; i < bob.length; i++) {
			for (int x = 0; x < bob[0].length; x++) {
				int age = min + generator.nextInt(max - min + 1);
				bob[i][x].setAge(age); 
			}
		}
		for (int i = 0; i < bob.length; i++) {
			for (int x = 0; x < bob[0].length; x++) {
				System.out.print(bob[i][x].getAge() + "    ");

			}
			System.out.println();
		}
	}

}

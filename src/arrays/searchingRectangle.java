package arrays;

import java.util.ArrayList;
import java.util.Random;

public class searchingRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
		Random generator = new Random(16);
		int min = 0;
		int max = 499;
		int width = 0;
		int length = 0;
		int amount = 0;
		for (int x = 0; x < 100; x++) {
			width = min + generator.nextInt(max - min + 1);
			length = min + generator.nextInt(max - min + 1);
			rec.add(new Rectangle(length, width));
		}
		for (int x = 0; x < rec.size(); x++) {
			if (rec.get(x).getWidth() == 10) {
				amount++;
			}
		}
		System.out.println(amount);
	}

}

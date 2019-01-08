package interfaces;

import java.util.ArrayList;
import java.util.Random;

public class mealTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Meal> meal = new ArrayList<Meal>();
		Random generator = new Random();
		int eggC = 0;
		int total = 0;
		int average = 0;
		int min = 1;
		int max = 3;
		for (int x = 0; x < 25; x++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				meal.add(new Breakfast(true, "Juice", 100));
			}
			if (randomNum == 2) {
				meal.add(new Lunch(60, 150));
			}
			if (randomNum == 3) {
				meal.add(new Dinner("Beef", "Ice Cream", 950));
			}
		}

		for (Meal x : meal) {
			if (x instanceof Breakfast) {
				Breakfast bob = (Breakfast) x;
				if (bob.getEggs() == true) {
					eggC++;
				}
			}
		}
		for (Meal x : meal) {
			total = total + x.getCalories();
		}
		average = total / meal.size();
		System.out.println(average);
		for (Meal x : meal) {
			if (x instanceof Dinner) {
				Dinner bob = (Dinner) x;
				System.out.println(bob.forDessert());

			}
		}
		for (Meal x : meal) {
			if (x instanceof Lunch) {
				Lunch bob = (Lunch) x;
				System.out.println(bob.clone());
			}

		}
	}
}

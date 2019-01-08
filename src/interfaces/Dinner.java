package interfaces;

public class Dinner implements Meal {
	private String protein;
	private String dessert;
	private int calories;

	public Dinner(String p, String d, int c) {
		protein = p;
		dessert = d;
		calories = c;
	}

	public String forDessert() {
		return dessert;
	}

	public int getCalories() {
		return calories;
	}

	public String toString() {
		return "Dinner object: Protein: " + protein + " Dessert: " + dessert + "Calories: " + calories;
	}

	public Object clone() {
		return new Dinner(protein, dessert, calories);
	}
}

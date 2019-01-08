package interfaces;

public class Breakfast implements Meal{
	private boolean eggs;
	private String drink;
	private int calories;

	public Breakfast(Boolean e, String d, int c) {
		eggs = e;
		drink = d;
		calories = c;
	}

	public boolean getEggs() {
		if (eggs = true) {
			return true;

		} else {
			return false;
		}
	}

	public int getCalories() {
		return calories;
	}

	public String toString() {
		return "Breakfast object: eggs: " + eggs + "drink: " + drink + "calories" + calories;
	}

	public boolean equals(Object anObject) {
		if (this.toString().equals(anObject.toString())) {
			return true;

		} else {
			return false;
		}
	}

	public Object clone() {
		return new Breakfast(eggs, drink, calories);
	}

}

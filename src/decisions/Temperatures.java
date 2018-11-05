package decisions;

import java.util.Scanner;

public class Temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the outdoor temperature?");
		double temp = input.nextDouble();
		if (temp <= -10) {
			System.out.println("It is too cold to do anything");
		} else {
			if (temp <= 35) {
				System.out.println("Go Snow Shoeing");
			} else {
				if (temp <= 74) {
					System.out.println("Go golfing");
				} else {
					if (temp <= 83) {
						System.out.println("Go play tennis");
					} else {
						if (temp > 83) {
							System.out.println("Go swimming");
						}
					}

				}
			}
		}

	}
}

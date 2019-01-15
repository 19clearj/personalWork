package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class autoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Auto> auto = new ArrayList<Auto>();
		Random generator = new Random();
		int min = 0;
		int max = 100;
		int total = 0;
		int totalC = 0;
		int totalM = 0;
		int average = 0;
		int cupholders = 0;
		int trucksWFD = 0;
		auto.add(new Car(100, 25, 5));
		auto.add(new Truck(150, 15, true));
		for (Auto x : auto) {
			int distance = min + generator.nextInt(max - min + 1);
			x.drive(distance);
		}
		for (Auto x : auto) {
			total = total + x.getO();
		}
		System.out.println(total);
		for (Auto x : auto) {
			totalC++;
			totalM = totalM + x.getMPG();
		}
		average = totalM / totalC;
		System.out.println(average);
		for (Auto x : auto) {
			if (x instanceof Car) {
				Car bob = (Car) x;
				cupholders = cupholders + bob.getCupHolders();
			}
		}
		System.out.println(cupholders);
		for (Auto x : auto) {
			if (x instanceof Truck) {
				Truck joe = (Truck) x;
				if (joe.getFourWD() == true) {
					trucksWFD++;
				}
			}
		}
		System.out.println(trucksWFD);
	}

}

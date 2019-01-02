package arrays;

import java.util.Random;
import java.util.Scanner;

public class reviewProjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			Scanner input = new Scanner(System.in);
			int ninth = 0;
			int twelve = 0;
			int average = 0;
			int total = 0;
			studentClass[][] bob = new studentClass[7][5];
			for (int i = 0; i < bob.length; i++) {
				for (int x = 0; x < bob[0].length; x++) {
					bob[i][x] = new studentClass();
				}
			}
			for (int x = 0; x < 7; x++) {
				for (int i = 0; i < 5; i++) {
					System.out.println("Enter your name:");
					String name = input.nextLine();
					System.out.println("Enter your grade: ");
					int grade = input.nextInt();
					bob[x][i] = new studentClass(name, grade);
				}
			}
			for (int x = 0; x < 7; x++) {
				for (int i = 0; i < 5; i++) {
					String name = bob[x][i].getName();
					int grade = bob[x][i].getGrade();
					if (grade == 9) {
						ninth++;
					}
					if (grade == 12) {
						twelve++;
					}
					total += name.length();
				}
			}
			average = total / 35;
			System.out.println("Amount of ninth: " + ninth);
			System.out.println("Amount of twelve: " + twelve);
			System.out.println("Average: " + average);

		}

	}
}

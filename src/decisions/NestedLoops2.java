package decisions;

import java.util.Scanner;

public class NestedLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter1 = 0;
		int counter2 = 0;
		for ( counter1 = 1; counter1 <= 4; counter1++) {
			for (counter2 =1; counter2<=5; counter2 ++) {
			if(counter2 == 3){
				System.out.print(counter1 +"  ");
			}
				else{
					System.out.print(counter2 + "  ");
				}
			}
			System.out.println();
		}
}
}

package randomNumbers;
import java.util.Random;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int min= 0;
int max = 1;
int counter = 0;
int heads = 0;
int totalheads = 0;
int tails = 1;
int totaltails = 0;
for (counter = 1; counter<= 1000000; counter ++){
	int randomNum = min +generator.nextInt(max - min + 1);
	if (randomNum == heads){
		totalheads ++;
	}
	if (randomNum == tails){
		totaltails ++;
	}
}
System.out.println("The total amount of heads is " + totalheads);
System.out.println("The total amount of tails is " + totaltails);

	}

}

package arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class SATsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> score = new ArrayList<Integer>();
Random generator = new Random(16);
Scanner input = new Scanner (System.in);
int min = 10;
int max = 1600;
boolean inThere = false;
for( int x = 0; x <1000; x ++){
	score.add(min + generator.nextInt(max - min + 1));
}
System.out.println("What did you get on the SAT?");
int answer = input.nextInt();
for(int x = 0; x<score.size(); x ++){
	if(score.get(x)== answer){
		inThere = true;
		System.out.println("Yes your score is in the array");
		break;
	}
}

	}

}

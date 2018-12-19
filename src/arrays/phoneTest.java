package arrays;
import java.util.ArrayList;
import java.util.Random;
public class phoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		ArrayList<classDesignPTDefinition> phone = new ArrayList<classDesignPTDefinition>();
		for(int x = 0; x <500; x++){
			phone.add( new classDesignPTDefinition("2627866253", 100));
		}
		int min = 0; 
		int max = 10;
		for(classDesignPTDefinition x : phone){
			for(int i= 0; i < 299; i++){
				int length  = min +generator.nextInt(max - min + 1); 
				x.makeCall(length);
			}
		}
	}

}

package strings;

import java.util.Scanner;

public class NameOrderUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name1 = input.next();
		System.out.println("Enter another name:");
		String name2 = input.next();
		if(name1.compareTo(name2) <0){
			System.out.println(name1.toUpperCase() + " comes before " + name2.toUpperCase() );
		}else{
			System.out.println(name2.toUpperCase() + " comes before " + name1.toUpperCase() );
		}
	
		
		
	}

}

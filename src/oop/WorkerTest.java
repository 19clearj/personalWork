package oop;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		bob.setHours(8);
		bob.setPay(11.50);
		System.out.println("Time working:" + bob.getHours());
		System.out.println("Pay:" + bob.getPay());
		System.out.println("New salary with raise:" + bob.getRaise());
		
	}

}

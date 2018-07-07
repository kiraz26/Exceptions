package exceptions;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		
		try { // >>---> Checked exception
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Could not sleep");
		}
		System.out.println("Slept for 2000 mls and woke up");
	}
	
	//RuntimeException class 

}

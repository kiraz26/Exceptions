package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			int[] nums = { 123, 34, 123, 45 };
			System.out.println(nums[2] + nums[4]);
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception happened");
		} finally { // Everytime run but some sitution except
			System.out.println("Finally Block");
		}

		// Even if exception was not successfully caught, code in finally block will
		// still run
		
		//Scenarios when Finallyt will not run:
		//1)System.exit(0) -> stop program
		//2)JVM crashes
	

	}

}

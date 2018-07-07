package exceptions;
/**
 * BElow code will result in StackOverflowError
 * 
 *
 */
public class ErrorDemo {

	public static void main(String[] args) {
		
		run(); //StackOverflowError

	}
	public static void run() {
		System.out.println("Running...");
		run();
	}

}

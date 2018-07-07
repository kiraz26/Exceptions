package exceptions;

public class RunTimeExceptions {

	public static void main(String[] args) {
		// RunTimeExceptions / UnChecked Exceptions
		String[] str = { "One", "Two", "Three" };
		// System.out.println(str[3]); // ---> ArrayIndexOutOfBoundsException
		// It is not continue
		// Execution stop there
		// We can tell Java, don't give up but do something else..
		// to do that

		try {
			System.out.println(str[3]);
		} catch (Exception exc) {

			System.out.println("Wrong index");
		}

		System.out.println("After array");

		try {
			int n1 = 100;
			int n2 = n1 / 0;
			System.out.println(n2);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("After try catch");

		/**
		 * EXCEPTION: >>>CHECKED (Compile Time)
		 * 					>>--->Some statements in code like opening file, connections
		 * 							to database, Java Expects exeptions to happen and will force the programmer
		 * 							to handle them or it will not compile 
		 * 			  >>>UNCHECKED (Run Time)
		 * 					>>--->Java does not except error
		 * 						 	there and code will compile and it is totaly up to a programmer to handle or
		 *							not. When we say handle, put try catch block |show java way to recover and
		 * 							not stop execution
		 */
		
		//THROWABLE class is the root/parent of all Exceptions >>>---> INTERVIEW QUESTION !!!
		try {
		String name = null;
		System.out.println(name.length()); // NullPointerException
		}catch(ArithmeticException e) { // it cannot catch because of different exception
			System.out.println("problem with string");
		}catch(NullPointerException e) {
			System.out.println("String is null");
		}
	}

}

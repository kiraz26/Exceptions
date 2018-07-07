package exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		String st1 = "Hello"; // if it null, it will be NullPointerException

		try {
			int i = Integer.parseInt("1234"); // if its parameter would have been "12a34", it would be
												// NumberFormatException
			int l = st1.length();
			System.out.println(i);
			System.out.println(l);
		} catch (NullPointerException e) { //this "e" is a final
			System.out.println("NullPointerException");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}

		System.out.println("After try catch");

		// When we use multi-catch block, order of exception types we are catching is
		// important:
			// 1)All types must be siblings
			// 2)The one on top must not be parent type

	}

}

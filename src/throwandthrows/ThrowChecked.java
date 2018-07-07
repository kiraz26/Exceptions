package throwandthrows;

import java.io.IOException;

public class ThrowChecked {
	public static void main(String[] args) {

		// we need to handle Checked Exception types
		try {
			System.out.println("About to throw a Checked Exception");
			throw new IOException();
		} catch (Exception e) {
			System.out.println("Exception was caught and handled");
			e.printStackTrace();
		}
		
		System.out.println("After Try-Catch");
		
		
	}

}

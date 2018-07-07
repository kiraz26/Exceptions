package throwandthrows;

import java.util.Scanner;

public class Login {

	public static final String USERID = "googleuser";
	public static final String PASSWORD = "java123";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter UserId:");
		String userId = sc.next();

		System.out.println("Enter Password:");
		String password = sc.next();
		
		if(! userId.equalsIgnoreCase(USERID)) {
			throw new RuntimeException("User id not found: "+userId);
		}
		
		if(! password.equals(PASSWORD)) {
			throw new RuntimeException("password did not match: "+password);
		}
		
		System.out.println("Welcome "+userId);
		
	}
}

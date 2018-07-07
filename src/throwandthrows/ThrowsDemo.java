package throwandthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
//1) HANDLE:
	// try {
	// 		FileReader reader = new FileReader("name.txt");
	// } catch (FileNotFoundException e) {
	// 		e.printStackTrace();
	// }
//2) DECLARE:
		// --> throws FileNotFoundException
		FileReader reader = new FileReader("name.txt");

	}

}

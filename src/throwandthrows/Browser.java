package throwandthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class Browser {

	public static void main(String[] args)  {
		System.out.println(LocalDateTime.now());

//		try {
//			Browser.sleep(5);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		System.out.println(LocalDateTime.now());
		
		try {
			readFile("File.txt");
		}  catch (IOException e) {
			System.out.println("File is not here");
		}
		
		readBook("Harry Potter");
//		throw new OutOfMemoryError();
		
		//throw new IOException();

	}

	public static void sleep(int seconds) throws InterruptedException { // --> declare rule!!!
		Thread.sleep(seconds * 1000);
		// try {
		// Thread.sleep(seconds * 1000);
		// } catch (InterruptedException e) {
		// System.out.println(e.getMessage());
		// }
	}

	public static void readFile(String fileName) throws FileNotFoundException, IOException {
		FileReader reader = new FileReader(fileName);
		reader.read();

	}
	
	public static void readBook(String title) throws IllegalArgumentException{
		System.out.println("Reading a book: "+title);
	}
	
	public static void test(int n) throws Exception{
		if(n < 0) {
			throw new Exception("Negative Number");
		}
		System.out.println("It is a positive number");
		
	}

}


















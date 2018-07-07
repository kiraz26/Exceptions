package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class ReadTxtFile {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Halil\\Desktop\\Hello.txt";
		
		// CHECKED Exception so we must handle it
		try {
			FileReader fs = new FileReader(filePath);
			BufferedReader reader = new BufferedReader(fs);
			String line = reader.readLine();
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			URL url =new URL("//hello.com"); // MalformedURLException
		}catch (MalformedURLException e) {
			System.out.println("Wrong url");
			e.printStackTrace();
		}
		
	}

}

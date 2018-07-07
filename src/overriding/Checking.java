package overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Checking extends Account {
	
	
	public void charge(int amount) throws FileNotFoundException {
		System.out.println("Charging from Checking account: "+amount);
	}
	
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing from Checking account: "+amount);
	}
	
	@Override
	public void withdraw() throws RuntimeException {
		System.out.println("Checking withdrawal");
	}

}

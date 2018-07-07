package overriding;

import java.io.IOException;

public class Account {
	
	public void charge(int amount) throws IOException{
		System.out.println("Charging: "+ amount);
		
	}
	
	public void deposit(int amount) throws NullPointerException{
		System.out.println("Depositing: "+amount);
	}
	
	public void withdraw() {
		System.out.println("Withdraw");
	}
	
}

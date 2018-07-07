package throwandthrows;

public class ThrowDemo {

	public static void main(String[] args) {
		
		//throw new RuntimeException();
		//throw new IllegalArgumentException("Invalid Input");
		
		
		
		vote(new Citizen("Bob Mar", 45));
		
		try {
		vote(new Citizen("Anna Mar", 17));
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void vote(Citizen citizen) {
		
		if(citizen.getAge() <= 18) {
			throw new ArithmeticException(citizen.getName()+" is not eligible for voting!");
		}
		System.out.println(citizen.getName()+" is eligible for voting");
		
	}

}

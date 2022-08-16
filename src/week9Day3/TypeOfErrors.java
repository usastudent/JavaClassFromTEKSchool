package week9Day3;

public class TypeOfErrors {
	
	public static void main(String[] args) {
		
		int numberA = 10; 
		int numberB = 0; 
		
		System.out.println("We trying to divide two number");
		int result = 0; 
		
		try {
			result = numberA / numberB ; 
		}catch(ArithmeticException e) {
			System.out.println("An exception happened with message " + e.getMessage());
		}
		
		System.out.println("Result is " + result);
		
		System.out.println("We Divided two number ");
	}
	

}


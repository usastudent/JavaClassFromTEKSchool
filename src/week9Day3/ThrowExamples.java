package week9Day3;

public class ThrowExamples {
	
	public static void main(String[] args) {
		
		/**
		 * Interview Question? 
		 * What is throw and what is throws? 
		 * 
		 * throw is reserved keyword it's use to throw new Exception. 
		 * 
		 * throws is reserved keyword and it comes at method decelerations. 
		 * and handling responsible for the others that using that method. 
		 * 
		 */
		
		
		try 
		{
		String password = "John";
		
		if (password.length() > 8) {
			System.out.println("Your password is good");
		}else {
			throw new RuntimeException("Your password should be more that 8 Character");
		}
		
		System.out.println("This is after if selections");
		
		}
		catch (RuntimeException e){
			System.out.println("you need to select longer password");
		}
		
	}

}


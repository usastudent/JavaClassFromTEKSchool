package week9Day1;

public class EHandlingExamples {
	
	// what is Exception: it means the interruption for our flow of data. whatever the code-
	//- which is we are written if there is any error or interruption we call it Exception-
	//- so if there is any exception occurred in our program automatically the rest of the code-
	//- will not be executed and the program will be terminated.
	
	// Exception Handling : avoiding abnormal termination of program.
	
	

	// ->> stack trace - is the message that you get as part of the exception
	// these will help you find where the exception is in the code 
	
	// ->> sand boxing - creating an isolated space to run the code. 
	
	// ->> tools for exception handling in java are 
	
	//    ----1. try/catch 
	
	     /*
	     *  	try {this is where code goes. / this is the sand box}: 
			write the code in which we are expecting the exception
	     */
	
	     /*
	      * catch (the exception that you expect ){this is if the exception occurs}
	      Handles Exception raised in the block
	     */
	
	//    ----2. throws - is a way to pass the responsibility of handling a checked 
	// exception, to the person calling your method
	
	
	
	// throw - means you are asking java to run that exception
	// which will basically crash your code

	// checked exceptions are the ones that will force you to handle them
	
	
	/*
	 * 	public static void main(String[] args) {
		
		int numbers[] = { 10, 5 };
		
		
		try {
		// this is the sand box
		// wee try to run this code 
		System.out.println(divide(numbers[0], numbers[5]));
		// and expect the following exception
		} catch (ArithmeticException e) {
			// if the above exception occurs
			// we run this block
			// if not, we run the code itself
			System.out.println("Can not Divide by Zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Indexes are out of boundry!");
			throw e;
		} finally {
//			System.out.println("Finally WILL execute regardless!");
		}
		
		System.out.println("End");
	}
	
	
	public static int divide(int a, int b) {
		return a / b;
	}
	 */
	

}


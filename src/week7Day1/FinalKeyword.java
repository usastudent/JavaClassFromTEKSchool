package week7Day1;

public class FinalKeyword {

	public static void main(String[] args) {
		//final keyword= is going to define how an object behave
		// final keyword means final value, it is not going to be changed
		// override
		// we have two kind of specifiers: 
		//1. Access modifier           2). non-access modifier

//			final String name= "kazem";
//			String name = "Ahmad";
			
		//final keyword =  constant
				// final is a non-access modifier / specifiers
				// 1. final variables = the value of the variable is 
				// constant and not going to change after the first initialization
				
				// 2. final method = a final method can not be overridden
				
				// 3. final class = final class can not be inherited from
				// final classes can not be parent or super class
				
				// access-modifier specifiers 
				final String name = "David";
				String name= "Mike"; // name is alredady finalized
				
				System.out.println(name);
			
				System.out.println(name);
				
	}

}

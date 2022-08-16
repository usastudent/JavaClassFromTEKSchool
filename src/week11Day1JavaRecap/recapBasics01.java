package week11Day1JavaRecap;

public class recapBasics01 {

	public static void main(String[] args) {

		// variables
		// 2 types
		// 1. primitives - 8
		// byte
		// short
		// int
		// long
		// float
		// double
		// char
		// boolean

		// 2. Reference

		char c; // declaration
		c = 'S'; // initialization
		c = 'A'; // assignment
		System.out.println((int) c);

		// declaration - defining the data type and name
		// assignment - assigning a value to the variable
		// initialization - first time you assign a value

		String str = new String("test");
		String str2 = "test";

		System.out.println(str2.charAt(0));
		
		
		// members of a class
		// 1. variables
		// 2. methods

		// flow of execution
		// 1. Sequential
		// 2. method call
		// 3. iteration
		// 4. selection

		boolean x = 5 > 10 ? true : false;
		System.out.println(x);

		
		// () + - * / %
		
		System.out.println("5/2 "+5/2);
		System.out.println("5%2 "+5%2);
		System.out.println("5.0/2.0 "+ 5.0/2.0);
		// 1 + 2 * 3 = 7
		// (1 + 2) * 3 = 9
		
		System.out.println(10.0/0);
		
		// promotion - when you mix the data types and lets say you
		// divide 3/2.0 then java needs to convert that 3 to double first
		// and then do the division, the result will be 1.5
		
		System.out.println(3.0/2); // 1.5
		
		
		
		int t = 10;
		t += 10; // t = t + 10
		
		
		String st1 = "test 1";
		String st2 = "test 2";
		System.out.println(st1.replaceFirst(String.valueOf(st1.charAt(0)), String.valueOf(st1.toUpperCase().charAt(0))));
		
		String text = "This is the text we want to convert to proper.";
		
		System.out.println("one " + 1);
		System.out.println(properString(text).replace("This", "That"));
	}
	
	public static String firstCharToUpper(String str) {
		return str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(str.toUpperCase().charAt(0)));
	}
	
	public static String properString(String str) {
		String temp = "";
		for(String s : str.split(" ")) {
			temp += firstCharToUpper(s) + " ";
		}
		return temp;
	}
	
	
	
	
}

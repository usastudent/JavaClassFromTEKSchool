package week7Day2;

public class StackAndHeap {

	public static void main(String[] args) {
		
		
				// access modifier is the same as specifier
				// the class should have constructor 
				//System.out.println(Math.static variables);
				// static call = name class.name function
				// dynamic call =name object.name function
		
		        // = means assignment 
				// == equality => : it compares the value in the stack
		
				// all the variables and primitive data types are stored in stack 
				// the object address is stored in stack as well
		
				// all the references data types are stored in heap
		
		String x = "1";
		String y = "2";
		String z = "3";
		String w = z;
		z = x;
		x = y;
		y = z;
		z = y;

		System.out.println(z); // ?

		int a = 1;
		int b = 2;
		int c = 3;

		a = b;
		b = c;
		c = a;

		System.out.println("c " + c);

	}

}

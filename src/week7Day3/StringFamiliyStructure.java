package week7Day3;

public class StringFamiliyStructure {

	public static void main(String[] args) {
		
	// Literal value is String literal : everything between " " is String literal.like "tek"
		
		// garbage collection: java will remove the data which no one is referring into it.-
		//-GC is in heap
		
		// String static pool : stores the same data in the same area in heap
		// method equal() compares the value of two objects
		
	//System.out.println("-------------------");
		 // class lesson
		
		// == equality operator is used to compare the values in the stack
				// == operator compare what you have in the stack , it looks for the address
				// .equal () method will compare the actual values of an object.
		
		// 1.= operator: you can compare the primitive data types : you are checking the values
				// 2. with reference data type, you are basically checking to see if two 
				// objects are stored in the same position  in the memory.
				//you are checking the reference of object 
				
				
				// using the "", the value is called literal 
//				String str1 = "test"; 
//				String str2 = new String("test");
//				String str3 = "test";
//				
//				System.out.println("str1 " + str1);
//				System.out.println("str2 " + str2);
//				
//				System.out.println(str1 == str2); 
//				System.out.println(str1 == str3);
				
				
				String obj1 = "testing";
				String obj2 = "Testing";
				String obj3 = new String("testing");
//				
//				System.out.println("1 " + (obj1 == obj2)); //1 false
//				//1 - testing and Testing are getting stored as different objects in the static pool 
//				
//				System.out.println("2 " + (obj1 == obj3)); //2 false
//				//2 obj1 is in the static pool, obj3 is in somewhere else in the heap
//				
//				System.out.println("3 " + obj1.equals(obj3)); //3 true
//				//3 the values of both objects are the same - testing 
//				
//				System.out.println("4 " + obj1.equals(obj2.toLowerCase())); //4 true
//				//4 if we convert obj2 to lower case and then compare the values with obj1, then the values are the same
//				
			System.out.println("5 " + (obj1 == obj2.toLowerCase())); //5 false 
//				//5 obj1 is stored in a different location comparing to obj2 new object
//				
//				System.out.println("6 " + (obj2 == obj2.toLowerCase())); //6 false
//				//6 obj2 is stored in a different location comparing to obj2 new object
//				
//				// Mutation - the idea of objects changing or not changing in the same location
//				
//				// -Mutable vs. Immutable
//				// --Mutable objects can change in the same location in the memory
//				// --Immutable object can change, but with any change, they make a new object in the 
//				// 	 memory and the reference will refer to that new object
//				
//				// String is an immutable class
//				String x = "some value"; // @123
//				String y = x;
//				x = "some other value"; // @237  
//		 		x = x.toUpperCase(); // @563   x is stored in the different location address
//				
//		 		System.out.println(x); // some other value

		
	}

}

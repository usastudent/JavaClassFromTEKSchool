package week2;

public class Day3Casting {

	public static void main(String[] args) {
		
		/*
		 * Type casting
		 * Assignment Operators
		 * Continuation of String Class
		 */
		
		// Upcasting- Downcasting     Widening - Narrowing 
		
//		Casting  -> Converting data types
		
//		Widening Casting (automatically) - converting a smaller type to a larger type size 
		
		
//		byte -> short -> char -> int -> long -> float -> double 

	// 	int a = 20;
	//    double b = a;     //implicit casting from int to double data type
////
	//    System.out.println(a);
//	    System.out.println(b);
	    
//	    double salary = 400;
		
//		Narrowing Casting (manually) - converting a larger type to a smaller size type 
//		double -> float -> long -> int -> char -> short -> byte 
		
//		double salary = 400.5;
//		int newSalary = (int) salary;
//		System.out.println(newSalary);
		
//		int myInt = 9;
//	    double myDouble = myInt; // Automatic casting: int to double
//	    System.out.println(myInt);      // Outputs 9
//	    System.out.println(myDouble);   // Outputs 9.0
		
		//Narowing
		
//		Example1
//		double myDouble = 9.78;
//	    int myInt = (int) myDouble; // Manual casting: double to int
//
//	    System.out.println(myDouble);   // Outputs 9.78
//	    System.out.println(myInt);      // Outputs 9
		
//		Example2
//	double num = 10.99;
	//    System.out.println("The double value: " + num);
//
//	    // convert into int type
//	    int data = (int)num;
//	    System.out.println("The integer value: " + data);
		
//		long id = 1L;
//		byte newId = (byte) id;
		
//		byte age = 23;
//		long newAge = age;
//		System.out.println(newAge);
		
//		 float grade = 79;
//		 int newGrade = (int) grade;
		
		//Assignment Operators
		
		// ==
//	int age = 29;
//		age++;
////		age = age +10;
//		age += 10;
//		System.out.println(age);
//		
		
//		int counter = 5;
//		counter = counter + 5;
//		System.out.println(counter);
		
//		int counter = 10;
//		
//		counter = counter - 1;
//		counter -= 5;
//		counter -= 5;
//		counter -= 5;
//		
//		System.out.println(counter);
		
		
//		double raise = 0.5;
//		raise = raise + 0.3;
//		raise = raise + 0.3;
////		
//	System.out.println(raise);
		
		
//		double salary = 4000;
//		
//		salary = salary * 0.5;
//		salary *= 0.5;
//		System.out.println(salary);
		
//		double price = 150;
//		double increasedPrice = price * 0.05;
//		price = price + increasedPrice;
//		System.out.println(increasedPrice);
//    	price = price + (price * 0.05);
//		System.out.println(price);
//		
//		int numberOfCars = 10;
//		numberOfCars = numberOfCars / 2;
//		numberOfCars /= 2;
//		System.out.println(numberOfCars);
		
		
//		int total = 41;
//		
//		int ramaidner = 41 % 10;
//		total = total % 10;
//		
//		total %= 10;
//		System.out.println(total);
		
		
		// Create a variable that holds an integer value, using assignment operator 
		//add 3 to it and print it
		
//		int counter = 0;
//		
//		counter += 3;
//		counter += 3;
//		counter += 3;
//		counter += 3;
//		counter += 3;
//		counter += 3;
//		
//		System.out.println(counter);
		
		
		//Create a variable that holds an integer value, using assignment operator 
		//subtract 2 from 5 times it and print it
		
//		int counter = 40;
//		counter -= 2;
//		counter -= 2;
//		counter -= 2;
//		counter -= 2;
//		counter -= 2;
//		
//		System.out.println(counter);
		
		// How to know a number is odd
		
//		int number = 12312;
//		int remainder = number % 2;
//		System.out.println(remainder);
		
		//Create a variable that holds an double value,
		//using assignment operator divide it by 0.3 and print it

//		double salary = 4500.9;
//		salary /= 0.3;
//		System.out.println(salary);
		
		
		
		//  "Hello" â†’ "He"
		//  abcdefg â†’  "abc"
		
//		String greeting = "This is a very long string ending with Hello";
//		String firstTwo = greeting.substring(0,2);
//		System.out.println(firstTwo);
//		
//		int index = greeting.length()-2;
//		
//		
//		String lastTwo = greeting.substring(index);
//		System.out.println(lastTwo);
		

		String name = "This is an example string";
		// len
	//	System.out.println(name.indexOf("is an example string"));
	//	int length = name.length();
//		System.out.println(length);
//		
//		int indexOfExample = name.indexOf("example");
//		System.out.println(indexOfExample);
//		int nextIndex = name.indexOf("string");
//		System.out.println(nextIndex);
////		
//		String result = name.substring(indexOfExample, nextIndex-1);
//		System.out.println(result);
//		
//		
//		String sentence = "The lazy dazy brown fox jumped over the lazy dog";
//		
//	int indexOfSecondLazy = sentence.indexOf("lazy do");
//		System.out.println(indexOfSecondLazy);
		
//		
//		int qBegining = sentence.indexOf("quick");
//		int qEnding = sentence.indexOf("brown");
//		
//		String q = sentence.substring(qBegining, qEnding);
//		System.out.println(q);
//		
//		int indexOfLazyfirstChar = sentence.indexOf("lazy");
//		int indexOfLazyLastChar = sentence.indexOf("dog");
//		System.out.println(q + sentence.substring(indexOfLazyfirstChar, indexOfLazyLastChar-1));
		
		 // "Hello", "There" â†’ "ellohere"
		 // "java", "code" â†’ "avaode"
		
//		String s1 = "Hello";
//		String s2 = "There";
//		
//		String first = s1.substring(1);
//		String second = s2.substring(1);
//		String result = first.concat(second);
//		
//		System.out.println(result);
		
		//("Hello", "Mike") â†’ "loMi"
		

		
		
		
		
		
		

	}

}

package week5Day3;

public class Student {

	// variables of the class
		String firstName;
		String lastName;
		int age;

		// constructor of the class :
		//used to create objects of the class and by default every class has a constructor
		// constructor name = class name
		// constructor doesn't have retrun type
		// Access-Modifier Name-of-Class(Arguments / parameters) { body of the method}
		// job of the constructor is to initialize all of the variables of the class
		// we mostly initialize to the default values
		
		// Arguments / parameters = are basically inputs to a method
		
		//default constructor
		public Student() {
			firstName = "";
			lastName = "";
			age = 0;
		}
		
		// parameters constructor
		public Student(String fn, String ln, int a) {
			firstName = fn;
			lastName = ln;
			age = a;
		}
		
		// you can have different versions of a method, its called overloading
		// the point is, you must have unique signatures
		
		
		
		// Components of a method:
		// Definition "public Student()" / whatever you have before the body of the method
		// Implementation "body of the method"
		// Signature "Student()" / name and arguments of the method 
		
		
		
		
		// 1. class name must start in upper case & it can not be a keyword

		// 2. main method is only used to run your code / not all of the classes
		// are designed to be executed

		// Constructor - is a function that is used to create an object of the class
		// by default, every class has one - you don't see it

		// members of a class
		// 1. variables
		// 2. methods/functions
		// 2.1. constructors
		// 2.2. functions/methods

		// variables / data-types
		// 1. primitives (8)
		// 2. reference / non-primitive
}

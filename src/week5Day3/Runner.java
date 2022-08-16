package week5Day3;

public class Runner {
	
	                 // what is main method?
	     //is a compiler to run our codes.
		// compiler? the translator between user and back of the computer. java is a compiler.
	public static void main(String[] args) {
		
		// to make an object of a class
				// data-type name = new constructor(args);
				String name = new String("Jack");
				
				// object of the class student
				Student obj1 = new Student();
				// to refer to the variables of an object. name the object.var-name
				obj1.firstName = "jack";
				obj1.lastName = "davidson";
				obj1.age = 25;
				
				Student obj2 = new Student();
				obj2.firstName = "Anna";
				obj2.lastName = "Ma";
				obj2.age = 45;
				
				Student obj3 = new Student("Ahmad", "Ahmadi", 27);
				
			
				System.out.println(obj2.firstName);
				
				System.out.println(obj3.age);
				
				
//				Book b1 = new Book("Harry Potter", "J. K. Rowling", 59.99, 5857);
//				
//				System.out.println(b1.title);
//				
//				b1.printBook();
//				
//				Book b2 = new Book();
//				b2.title = "name of the book";
//				b2.author = "name of the author";
//				b2.price = 10.99;
//				b2.pageCount = 50;
//				
//				b2.printBook();
				
				
				
				// class name is Teacher
				// first name
				// last name
				// age 
				// default constructor
				// parameterized constructor
				// function that prints the information of the teacher

	}

}

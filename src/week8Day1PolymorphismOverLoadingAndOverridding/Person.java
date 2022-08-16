package week8Day1PolymorphismOverLoadingAndOverridding;

public class Person {
	
	String firstName;
	String lastName;
	//Overloading is a methods with the same name but different arguments.
	// overloading is having multiple 
	// versions of the same method in the same class
	// example: having multiple versions of the constructor
	
	
	
	//1) overriding is changing the implementation of the function
	// that you have inherited only for the current class
	// example: inheriting the toString function from the parent class Object
	// and re defining it in you class is overriding.
	// 2) In overriding ; you must take the same argument as in super method class-
		//-like: void eat() should be the same in all other sub classes.
	// 3) you can not change the scope of the method , exp: you can not change the public to 
	//private in any methods
	
	/**
	 *  the difference between overloading and overriding:
	 *  In overloading we add different parameters in argument of the methods in the same class
	 *  like : public void calculate ();
	 *         public void calculate(string name);
	 *         public void calculate (String name,int age);
	 *         BUT IN Overriding:
	 *  we don't make any change in argument or parameters of the main method of subclass,
	 *  we only make changes in code which they are .
	 *  like : public void calculate(){System.out.println("Hello");
	 *         public void calculate(){system.out.println(How are you");
	 */
	
	// Up-casting is the idea of declaring an object 
	// of the parent class and initializing any of the sub classes.
	// for example, classes Employee and Student are inheriting from Person
	// so you can do the following
	// Person obj1 = new Person();
	// Person obj2 = new Employee();
	// Person obj3 = new Student();
	
	public Person() {     // constructor overloading
		super();
		this.firstName = "";
		this.lastName = "";
	}
	
	public Person(String firstName, String lastName) {   // constructor overloading
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFullName() {   // method overloading
		return "Person: " + firstName + " " + lastName; 
	}
	
	public String getFullName(String note) {     // method overloading
		return "Person: " + firstName + " " + lastName + "   Note: " + note; 
		
	}

}

package week8Day2Abstraction;

public abstract class AbstracTestCaseBase {

	//you have the option to have zero or many abstract methods or variables
	// you need to use the keyword extends
	// you are going to inherit the non-abstract / methods with implementation
	// you will be forced to implement the abstract methods
	// you can not have objects of abstract classes
	
	// after extends keyword you can only enter one class
	// after impliments keyword you can enter many interfaces.
	
	// if we put abstract keyword the method doesn't need body.
	
	// the class which extends they can have both abstract method and non abstracted methods-
	//- at the same class.
	
	int x = 10;
	
	public void printTheInt() {
		System.out.println(x);
	}
	
	public abstract void printSOmething();
	
}

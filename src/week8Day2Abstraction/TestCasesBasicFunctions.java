package week8Day2Abstraction;

public interface TestCasesBasicFunctions{

	// abstraction is the idea of providing definition of the code
	// and not providing the implementation
	
	// Interface is not a class

	// the keyword that we use for abstraction is 'implements'
	// one class can implement multiple interfaces at the same time

	// 1. Interface
	// contract / list of things that a class must have
	// we are not suppose to have implementation of the functions
	// exceptions are 'static' and default functions
	// you can have variables in an interface,
	// those variables will be public final static all the times
	// can not have constructors / can not have objects
	
	// when you are Interface it means you are 100% in Abstraction so if you say or not say
	// the abstract key , it is OK. if you have or you don't have the Abstract key ,
	//it doesn't matter. 

	// abstract is a keyword in java
	// it doesn't have any implimination

	// variables : Variables are all public final static , if you say or you don't say it.
	// So all the variables are accessible by other classes through implements.
	public final static int x = 10;

	public abstract void printResult();    // these are abstarct code

	public abstract void printStatus();

	public abstract boolean getTestResult();

	public abstract String generateTestCaseInfo(String name);

	// default keyword - you can provide a default implementation for the method
	// it is used when we add a new method , normally if we add a new method in Interface-
	//- then we need to all the classes one by one and add the new method in them as well-
	// but if we put the new method as default then we can code it in interface so these -
	//- default function will pass to all the classes.
	
	public default void newFunctionAddedLater() {
		System.out.println("this is the default implementation");
	}

	// static : it is an exception in Interface because you can add implementation in 
	// interface in it, it is the part of interface so you can not inherited to other classes.-
	// static stays with interface
	//  if you don't put static it complaint to make their code like:
	public static boolean checkSomething() {
		return false;
	}
}

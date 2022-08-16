package week8Day1Polymorphism;



public class Polymorphismnote {

	public static void main(String[] args) {
		/**
		 * what is Polymorphism:
		 * implementing something in different ways.
		 * 
		 * It is divided into categories:
		 * 1) compile time Polymorphism
		 * 2) Run time Polymorphism
		 */
		
		/*
		 * 1) compile time Polymorphism :
		 * it is achieving by implementing Method Overloading( Static Binding )
		 * 
		 * 
		 * 2)  Run time Polymorphism:
		 * it is achieving by implementing Method Overriding ( Dynamic Binding )
		 */
		
		/*
		 * Differences between methods Overloading and Overriding:
		 *  
		 *   Overloading									Overriding
		 *  1) compile time Polymorphism                 Run time Polymorphism
		 *  2) Static Binding				             Dynamic Binding
		 *  3) implemented in single class               implemented in two or more classes
		 *  4) No need of inheritance                    works with help of inheritance 
		 *  5) Method name should be the same            Method name should be the same 
		 *  6) Same name with different in parameters    same name and same parameters 
		 *  7) the return type can be different          the return type should be same
		 *  8) Static methods can be overloaded          Static methods cannot be overridden
		 *  9) Early Binding ( bc it is compile time     late Binding ( because it is run time
		 * 
		 *                                         
		 *  10)                                         Methods declared with final keyword 
		 *                                              can not be overridden or final variable
		 *                                              
		 *     11)                                         it should have the same scope 
		 *                                              scope means if super class is public
		 *                                              the subclasses should be public as well
		 *                                              
		 *                                              12 up/down casting happens in run time
		 */
		
		// Example:
		/*
		 * Class Overload    ( it is used in Single class )
		 * void add( ) {
		 *              }
		 *              
		 * void add (int x, int y){
		 *                         }
		 *                         
		 * int add ( int x, int y){
		 *                                            
		 */
		
		// example : 
		/**
		 * Class overridden    ( it is used in multi classes , super class and subclasses )
		 *                      ( and it is used only when inheritance happens)
		 *
		 * Class P {
		 *           void add(){
		 *                       }
		 *                       
		 * Class C extends P {
		 *            void add(){
		 *                       }    
		 *                                         
		 */

		// Method Overriding   (Run time Polymorphism)
		/* 
		 * Overriding means : writhing the same method in different ways by help of inheritance
		 * the purpose is if the chain is not satisfied with super class we can make the same 
		 * method in subclasses with different implimentaion 
		 */
		
		// Overloading Method: means same name ,different parameters
		
		/*
		 * there are 3 types of Overloading in java
		 * all three types are part of Polymorphism : executing the something in different way
		 * 1) Constructor Overloading
		 * 2) Method Overloading
		 * 3) Operator Overloading => + => 1) it is used for addition
		 *                                 2) it is used for concatenation 
		 */
		// and it happens by compile time 
		/*
		 * Constructor Overloading: 
		 * if you don't  put any return type for your function it is called constructor
		 * but if you put return type for your function it is called method
		 */
		
		
		/*
		 * Example for operator Overloading
		 * public class Testiii {
		int a = 5;
		int b= 6;
		public static void main(String[] args) {
			
			Testiii count = new Testiii();
			 System.out.println("a+b"+ (count.a+count.b));
		 
	
	
}
	}
		 */
		
		
			// Static binding and Dynamic Binding:
		 
		/*
		 * Binding means : linking between method call and method definition
		 * ex:
		 * public class A{
		 * void M1 () // this is method definition 
		 * {
		 *      };
		 *       public static void maind (String [] args)
		 *       {
		 *           A obj = new obj();
		 *           obj.m1();  // this is called (method call)	
		 *           
		 *    . the connection between method call and method definition is called Binding.	  
		 */
		
		 /*
		  * static vs Dynamic Binding:
		  * 1) Static binding uses type information for binding while dynamic binding
		  * uses Object to resolve binding
		  * 
		  * 2) Binding of all static , private and final methods is done at compile - time
		  * 3) overloading methods are resolved using Static binding while overridden methods
		  * using dynamic binding at run time. 
		  */
		
			
	}

}













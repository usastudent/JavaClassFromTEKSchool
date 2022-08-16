package week7Day1;

public class StaticKeyword {

	//	dynamic= it means it is changeable
	//	static= it means it is not changeable
	// static works only inside the class, and it works like header and footer in word file
	// Static modifier doesn't need to have object to get called.
	
	// static keyword : when you use it the variable or method belongs to the class-
	// -not the object and by using static keyword you do not need object to call the method or
	//variable , you just take the name of the class and then . variable or method.
	
	
	Student.printCount();
	// dynamic variables belongs to the objects of the class
	// static variables belongs to the class
	Student obj1 = new Student();
	obj1.name = "Jack";
	
	Student obj2 = new Student();
	obj2.name = "David";
	
	Student.printCount();
	
	Student obj3 = new Student();
	obj3.name = "Anna";
	Student obj4 = new Student();
	Student obj5 = new Student();
	Student obj6 = new Student();
	Student obj7 = new Student();
	
//	Student.school = "TEK";
	
	
	System.out.println("obj1 " + obj1.name + "    " + Student.school);
//	
//	Student.school = "Something else";

	System.out.println("obj2 " + obj2.name + "    " + Student.school);
	System.out.println("obj3 " + obj3.name + "    " + Student.school);
//	 static vs dynamic 
	System.out.println(Student.count);
	
}

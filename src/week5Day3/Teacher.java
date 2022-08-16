package week5Day3;

public class Teacher {

	// class name is Teacher
		// first name
		// last name
		// age
		// default constructor
		// parameterized constructor
		// function that prints the information of the teacher

		String firstName;
		String lastName;
		int age;

		public Teacher() {
			firstName = "";
			lastName = "";
			age = 0;
		}
		
		public Teacher(String fn, String ln, int a) {
			firstName = fn;
			lastName = ln;
			age = a;
		}
		
		public void printTeacherInfo() {
			System.out.println("First Name: " + firstName 
					+ "  Last Name: " + lastName
					+ "  Age: " + age);
		}
	
}

package week6Day3;

public class Student extends Person{

	

		private double gpa;
		private int grade;

		// job of constructor: initialize all of the variables of the class
		// keyword 'super' will let you reach the parent class
		// super keyword is exactly like this keyword
		// super refers to immediate parent class
		// this refers to current class
		
		// the (): is the signature , if inside of it is empty it refers to the constructor -
//		-with empty signature(), but if inside of () is something (paramatized constructor )=
//		-it refers to that constructor with paramatized constructor, exp:
//  	the () will match the siganture of the constructor
//		super()
//		super(name, email, phone, age) 
//		or
//		this()
//		this(paramatized constructor)
		
		// this keyword had 2 use cases
		// 1. this.variable
		// 2. this() would chain a constructor

		public Student() {
			super();  // super means parent class, ():and inside the parantese is signature
			this.gpa = 0;
			this.grade = 0;
			
		}

		public Student(double gpa, int grade, String name, String email, String phone, int age) {
			super(name, email, phone, age); // this super () match the signature inside the ()
			this.gpa = gpa;
			this.grade = grade;
		}

		public double getGpa() {
			return gpa;
		}

		public int getGrade() {
			return grade;
		}

		public void setGpa(double gpa) {
			this.gpa = gpa;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "Student [gpa=" + gpa + ", grade=" + grade + "]";
		}
		
		
		
		
	}



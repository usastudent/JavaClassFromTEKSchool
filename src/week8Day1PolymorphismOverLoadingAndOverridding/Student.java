package week8Day1PolymorphismOverLoadingAndOverridding;

public class Student extends Person {

	public Student() {
		super();
	}

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public String getFullName() {
		return "Student: " + firstName + " " + lastName;
	}
}

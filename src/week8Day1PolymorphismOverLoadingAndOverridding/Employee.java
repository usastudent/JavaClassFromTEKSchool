package week8Day1PolymorphismOverLoadingAndOverridding;

public class Employee extends Person{

	public Employee() {
		super();
	}
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	@Override
	public String getFullName() {
		return "Employee: " + firstName + " " + lastName;
	}
}

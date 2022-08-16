package week8Day1PolymorphismOverLoadingAndOverridding;

public class Runner {

	public static void main(String[] args) {
		
		Person p = new Person("Michael", "Jackson");
		System.out.println(p.getFullName());
		System.out.println(p.getFullName("Homeland"));
		
		Student stu = new Student("Anna", "Davidson");
		System.out.println(stu.getFullName());
		
		Employee emp = new Employee("Jack", "Dani");
		System.out.println(emp.getFullName());
		
		
		Person temp = new Student("Harry", "Potter");
		
		Person[] persons = new Person[5];
		persons[0] = p;
		persons[1] = stu;
		persons[2] = emp;
//		
//		
//		
		System.out.println(temp.getFullName());
//		System.out.println(p.getFullName());	
//		System.out.println(stu.getFullName());
//		System.out.println(emp.getFullName());

	}

}

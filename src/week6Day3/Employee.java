package week6Day3;

public class Employee extends Person{

	

		private String department;

		public Employee() {
			super();
			this.department = "";
		}
		
		public Employee(String department) {
			this();
			this.department = department;
		}
		
		public Employee(String department, String name, String email, String phone, int age) {
			super(name, email, phone, age);
			this.department = department;
		}
		
		public String getDepartment() {
			return department;
		}
		
		public void setDepartment(String department) {
			this.department = department;
		}
		
		
	}
	

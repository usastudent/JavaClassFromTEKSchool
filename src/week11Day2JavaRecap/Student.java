package week11Day2JavaRecap;

public class Student {

	
	private String name;
	private int age;
	private int something;
	
	public Student() {
		super();
		this.name = "";
		this.age = 0;
		this.something = 0;
	}

	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", age=" + age + "]";
//	}
//	
	
	
	
}


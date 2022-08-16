package week7Day1;

public class Student {

	String name;
	static String school = "TEK";
	static int count = 0;

	public Student() {
		super();
		this.name = "";
		count++;
	
	}

	public String getName() {
		return name;
	}
	
	public static void printCount() {
		System.out.println(count);
	}
}

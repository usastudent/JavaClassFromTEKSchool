package week10Day4Lab;

public class Student {
	
	private String fullName;
	private int age; 
	private double score;
	
	public Student() {}
	
	public Student(String fullName, int age , double score) {
		this.fullName = fullName; 
		this.age = age; 
		this.score = score;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	} 

}

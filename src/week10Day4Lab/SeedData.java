package week10Day4Lab;

import java.util.HashMap;
import java.util.Map;

public class SeedData {
	
	public Map<Integer, Student> getStudentsList() {
		
		HashMap<Integer, Student> students = new HashMap<>();
		
		Student student1 = new Student("Haroon Sadiq", 25, 80);
		Student student2 = new Student("Mohammad Shokriyan", 35, 40);
		Student student3 =new Student("John Smith", 50 , 60);
		Student student4 =new Student("David Cook", 25 , 80);
		Student student5 =new Student("Jeniffer Lopez", 50 , 90);
		Student student6 =new Student("Sam Azad", 33 , 45);
		
		students.put(1, student1);
		students.put(2, student2);
		students.put(3, student3);
		students.put(4, student4);
		students.put(5, student5);
		students.put(6, student6);
		
		return students;
	}

}


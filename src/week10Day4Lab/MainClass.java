package week10Day4Lab;

import java.util.Map;
import java.util.Set;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Get list of students. and check their score if less than 50 they are fails
		// if their score is more than/equal 50 they are passed. 
		// if their score is more than/equal 50
		// and it's more that 80 they did a great job. 
		
		SeedData data = new SeedData(); 
		
		Map<Integer, Student>  students =data.getStudentsList(); 
		// loop through the students. 
		Set<Integer> keys = students.keySet();
		
		for (Integer key : keys) {
			Student student = students.get(key);
			
			if (student.getScore() < 50) {
				System.out.println(student.getFullName() 
						+ " Failed with score " + student.getScore());
			} else if (student.getScore() >= 50 && student.getScore() < 80) {
				System.out.println(student.getFullName() 
						+ " Passed with score " + student.getScore());
			} else if (student.getScore() >= 80) {
				System.out.println(student.getFullName() 
						+ " Passed with score " + student.getScore() 
						+ " You Great Job");
			}
		}
		
	}

}


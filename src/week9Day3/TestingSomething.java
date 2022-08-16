package week9Day3;

import java.io.FileNotFoundException;

public class TestingSomething {
	
	public static void main(String[] args) {
		UtilityClass utility = new UtilityClass(); 
		
		try {
			utility.readFromFile("some file path");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

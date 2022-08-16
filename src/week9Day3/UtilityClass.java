package week9Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class UtilityClass {
	
	public double doDivision(double first, double second) throws ArithmeticException{
		return first / second; 
	}
	
	
	public void readFromFile(String file) throws FileNotFoundException, ArithmeticException {
			InputStream stream = new FileInputStream(new File(file)) ;
	}
}
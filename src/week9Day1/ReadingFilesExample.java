package week9Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesExample {

	public static void main(String[] args) {
		
		System.out.println(readFile("c:/test.txt2"));
		
		try {
			System.out.println(readFile2(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String readFile(String path) {
		File myFile = new File(path);
		try {
			Scanner reader = new Scanner(myFile);
			return reader.nextLine();
		} catch (FileNotFoundException e) {
			System.out.println("No such files found in the path provided!");
		} finally {
			// close the stream
		}
		return "";
	}
	
	public static String readFile2(String path) throws FileNotFoundException {
		File myFile = new File(path);
		Scanner reader = new Scanner(myFile);
		return reader.nextLine();
	}
	

}
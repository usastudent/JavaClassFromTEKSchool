package week10Day4Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CopyACollection {
	
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		Collections.addAll(names, "John", "Jeniffer", "Mohammad", "Sam", "David" , "Ahmad");
		
		System.out.println(names);
		//Sort this set. 
		// Convert to List the use Collections.sort();
		//Use Constructor of ArrayList and pass any collections. 
		//It will copy all the values to new ArrayList. 
		ArrayList<String> nameList = new ArrayList<>(names);
		Collections.sort(nameList);
		
		System.out.println(nameList);
	}
	
	public final void method() {
		
	}
	

}

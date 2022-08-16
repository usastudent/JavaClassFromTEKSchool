package week10Day4Lab;

import java.util.HashMap;
import java.util.Set;

import javax.swing.text.MaskFormatter; 
public class MapExample {
	
	public static void main(String[] args) {
		
		//when to use map? 
		//whenever you have key , value pairs.
		//Declare and Instantiate. 
		HashMap<String, String> maps = new HashMap<>();
		//adding data using put method
		maps.put("name", "Mohammad"); 
		maps.put("Address", "Alexandria");
		maps.put("State", "Virginia");
		maps.put("Phone Number", "202-123-4567");
		
		// retrieve values
		String value = maps.get("name");
		System.out.println(value);
		// loop through the keys.
		Set<String> keys = maps.keySet(); 
		for (String key : keys) {
			System.out.println(maps.get(key));
		}
	}

}


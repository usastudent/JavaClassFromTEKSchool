package week10Day2Collection;

import java.util.Set;
import java.util.TreeMap;

public class HashMapObjectExample {
	
	public static void main(String[] args) {
		
		// you can only loop through all the objects of the map by only first-
		//-Set<String> keySet =person.keySet(); first you need to get the key and then -
		// - loop through
		
		TreeMap<String, Object> person = new TreeMap<>();
		person.put("name", "John");
		person.put("age", 30);
		person.put("car", null);
		
		// How we loop through keys of the maps. 
		Set<String> keySet =person.keySet();
		
		for (String key : keySet) {
			System.out.println("Key: " + key + " Value: " + person.get(key));
		}
		
	}

}

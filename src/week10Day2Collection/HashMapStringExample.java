package week10Day2Collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapStringExample {
	
	public static void main(String[] args) {
		HashMap<String, String> person = new HashMap<>();
		person.put("firstName", "Mohammad");
		person.put("lastName", "Shokriyan");
		person.put("Job Title", "Software developer");
		
		Set<String> allKeys = person.keySet();
		for (String value : allKeys) {
			
			System.out.println(person.get(value));
			
		}
	}

}

package week10Day1CollectionExample;

import java.util.HashMap;

public class HashMapExamples {

public static void main(String[] args) {
		
		
		
//		Map is a different collection and it is based on key and value pairs data structure
		// you need a data type for keys
		// you need a data type for values
		// not based on indexes
		// keys should be unique - keys will always be stored in a set structure
		
		
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		
		
		// put, will add key value pair to the map
		data.put(1, "name 1");
		data.put(2, "name 2");
		data.put(1, "name 3");
		
		System.out.println(data);
		
		// to get one value, use get and pass a key
		System.out.println(data.get(2));
		
		// contains functions will check to see if the element is present in the map
		System.out.println(data.containsKey(1));
		System.out.println(data.containsValue("name 4"));
		
		
	}
	
}

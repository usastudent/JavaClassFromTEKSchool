package week10Day2Collection;

import java.util.HashMap;

public class MapAndHashMap {
	
	public static void main(String[] args) {
		/**
		 * Map is an interface. 
		 * HashMap and TreeMap are the popular implementation of Map interface.
		 * both are  based on Key/Value pairs. 
		 * Keys are Sets. (in HashMap the keys are  base on HashSet, 
		 * and in TreeMap the keys are base on TreeSet)
		 * No duplicate key for both, keys are unordered in HashMap and ordered internally in -
		 * - in HashSet.
		 * you can have duplicate values. but you cannot have duplicate keys.
		 * You need to provide the key in order to retrieve the value. 
		 * Its Generic and you have to specify type of Key and type of values. 
		 */
		//HashMap. 
		//Type    key     value
		HashMap<Integer, String> citiesMap = new HashMap<>();
		citiesMap.put(1, "Alexandria");
		citiesMap.put(2, "Tysons Corner");
		citiesMap.put(3, "Vienna");
		citiesMap.put(4, "Sacramento");
		citiesMap.put(5, "San Diego");
		
		System.out.println(citiesMap);
		
		String city = citiesMap.get(1);
		System.out.println(city);
	}

}

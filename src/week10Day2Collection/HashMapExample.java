package week10Day2Collection;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> citiesMap = new HashMap<>();
		citiesMap.put(1, "Alexandria");
		citiesMap.put(2, "Sacramento");
		citiesMap.put(3, "Vienna");
		citiesMap.put(4, "Vienna");
		citiesMap.put(5, "Vienna");
		
		System.out.println(citiesMap);
	}

}

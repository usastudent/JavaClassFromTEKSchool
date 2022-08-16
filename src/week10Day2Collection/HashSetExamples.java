package week10Day2Collection;

import java.util.HashSet;

public class HashSetExamples {
	
	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<>(); 
		cities.add("Alexandria");
		cities.add("Richmond");
		cities.add("Tysons Corner");
		cities.add("San Diego");
		cities.add("Alexandria");
		cities.add("richmond");
		
		System.out.println(cities.size());
		
		for (String value : cities) {
			System.out.println(value);
		}
		
		cities.remove("richmond");
		cities.clear();
		System.out.println(cities);
	}

}

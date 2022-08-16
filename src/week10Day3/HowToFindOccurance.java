package week10Day3;

import java.util.HashMap;

public class HowToFindOccurance {
	public static void main(String[] args) {

		// write a function that counts the number of occurrence of each character
		// This is a TEST
		// T=3, h=1, i=2, s=2, a=1, E=1, S=1
		String str = "this is a test string that you need to count the number of occurence of each character";
		
		HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
		
		// go through all of the chars of the given string
		for (int i = 0; i < str.length(); i++) {
			// check and see if the char exist in the map
			if(chars.containsKey(str.charAt(i))) {
				// we already have this char in the map
				// we first need to know what is the current count
				int currentCount = chars.get(str.charAt(i));
				// increase the count by 1
				int newCount = currentCount + 1;
				// add the count to the map
				chars.put(str.charAt(i), newCount);
				
			} else {
				// this is the first time we see this char
				chars.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(chars);
	}
}


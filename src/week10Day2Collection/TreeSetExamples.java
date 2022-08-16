package week10Day2Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
	
	public static void main(String[] args) {
		/**Tree Set 
		 * another implementation of Set
		 * it will not accept duplicated values. 
		 * Unordered collection. (but ordering values internally).  
		 */
		
		//HashSet<String> values = new HashSet<>(); 
		Set<String> values = new TreeSet<>();
		values.add("Phone");
		values.add("Computer");
		values.add("Labtop");
		values.add("Fridge");
		values.add("12");
		values.add("05");
		
		for (String value : values) {
			System.out.println(value);
		}
	}

}


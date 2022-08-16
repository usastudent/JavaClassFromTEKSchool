package week10Day4Lab;

import java.util.ArrayList;
import java.util.Collections;

public class Examples {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Something");
		list.add("Something else" );
		
		Collections.addAll(list, "Nothing", "Nothing else", "Sometimes");
		
		System.out.println(list);
		
		for (String value : list) {
			if (value.startsWith("S") ) {
				System.out.println(value);
			}
		}
		
	}

}


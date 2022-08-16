package week10Day2Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Alexandria");
		list.add("Sacramento");
		list.add("Fulls Church");
		
		
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list.get(2));
		
	}

}


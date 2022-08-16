package week10Day2Collection;

import java.util.HashSet;

public class SetExampleWithObjects {
	
	public static void main(String[] args) {
		
		HashSet<Item> items = new HashSet<>();
		
		Item item1 = new Item("iPhone 13 ProMax", 1299.99);
		Item item2 = new Item("Samsung S10", 1099.99);
		
		items.add(item1);
		items.add(item2);
		
		for (Item each : items) {
			System.out.println("Item name is " + each.getName() 
			+ " Item price is: " + each.getPrice());
		}
		
	}
}

package week6Day2;

public class VendingMachineRunner {

	public static void main(String[] args) {
		VendingMachine titan = new VendingMachine();
		
		titan.addProduct("redbull",4.0, 3, 0, 0);
		titan.addProduct("monster",5.0, 4, 0, 1);
		titan.addProduct("milk",6.0, 5, 0, 2);
		titan.addProduct("juice",7.0, 7, 0, 3);
		
		titan.addProduct("cake", 10, 5, 0, 0);
		titan.restock(0, 0, 10);
		titan.sellProduct(0, 1, 3, true);
		titan.printInventory();
	//	System.out.println(titan);

	}

}

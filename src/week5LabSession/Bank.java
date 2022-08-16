package week5LabSession;

public class Bank {

	public static void main(String[] args) {
		
		// vending machine. we need an application to keep track of the items in 
				// in different spots of machine
				// the machine has 3 x 4 
				// functions needed: buy item, re stock, print info
				
				
				Customer customer1 = new Customer(123456, "Ahmad", "Ahmadi", 857.50);
				Customer customer2 = new Customer(321654, "David", "Jackson", 554.88);
				Customer customer3 = new Customer(987654, "Anna", "Daniel", 999.99);

				Customer[] vaCustomers = new Customer[5];
				vaCustomers[0] = customer1;
				vaCustomers[1] = null;
				vaCustomers[2] = null;
				vaCustomers[3] = null;
				vaCustomers[4] = null;

				
				for (int i = 0; i < vaCustomers.length; i++) {
					if(vaCustomers[i] != null) {
						vaCustomers[i].printInfo();
					}
					
				}

	}

}

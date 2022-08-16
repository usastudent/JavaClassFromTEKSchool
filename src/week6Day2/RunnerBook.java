package week6Day2;

public class RunnerBook {

	public static void main(String[] args) {
		
		//System.out.println(obj1.getIsbn("124"));  //this is for hidding isbn by password 
		
		Book obj1 = new Book("Harry Potter and the Sorcerer's Stone", "9780001912366",
				"some company", 589,"J K Rolling");
				
//		System.out.println(obj1);
//
//		obj1.setName("new name");
//
//		System.out.println(obj1);
		System.out.println(obj1.getAuthor());
		

	}

}

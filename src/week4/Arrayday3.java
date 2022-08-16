package week4;

public class Arrayday3 {

	public static void main(String[] args) {
		
		// Single Dimension Array
		// Array Data Type int
		//int[] numbers = new int[10];
		//int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		// Array Data Type String
		//String[] names = new String[5];
		//String name [] = new String [5];
		//// Array data Type Char
		//char[] character = new char[5];
		//char[] character1 = {'a','b','c'};
		////array data type double
		//double[] doubleArray = new double[10];

		
		//          [ outter array] [inner array]
		
		int[][] table = new int[3][4];

		 table[0][0] = 1;
		table[0][1] = 2;
		table[0][2] = 3;
		table[1][0] = 4;
		table[1][1] = 5;
		table[1][2] = 6;
		table[2][0] = 7;
		table[2][1] = 8;
		table[2][2] = 9;
		table[2][3] = 50;

		 for (int i = 0; i < table.length; i++) {
		for (int j = 0; j < table[i].length; j++) {
		System.out.print(table[i][j] + " ");

		 }

		 }
		
//		String[][]customers = new String[7][3];
//		customers[0][0] = "Alex";
//		customers[0][1] = "male";
//		customers[0][2] = "20";
//		customers[1][0] = "victoria";
//		customers[1][1] = "female";
//		customers[1][2] = "25";
//		customers[2][0] = "john";
//		customers[2][1] = "male";
//		customers[2][2] = "30";
//		customers[3][0] = "ahmad";
//		customers[3][1] = "male";
//		customers[3][2] = "18";
//		customers[4][0] = "King";
//		customers[4][1] = "male";
//		customers[4][2] = "1";
//		customers[5][0] = "Rahim";
//		customers[5][1] = "male";
//		customers[5][2] = "5";
//		customers[6][0] = "nazanin";
//		customers[6][1] = "female";
//		customers[6][2] = "19";
//		for(int i=0;i<customers.length;i++) {
//			//      i< 7 : it gives us the length of outter array
//		for(int j=0; j<customers[i].length;j++) {
//			//       i< 3 : it gives us the length of inner array 
//		System.out.print(customers[i][j] + " \n");
//		}
//		}
		
		//----------
//		String[][]customers = new String[7][3];
//		customers[0][0] = "Alex";
//		customers[0][1] = "male";
//		customers[0][2] = "20";
//		customers[1][0] = "victoria";
//		customers[1][1] = "female";
//		customers[1][2] = "25";
//		customers[2][0] = "john";
//		customers[2][1] = "male";
//		customers[2][2] = "30";
//		customers[3][0] = "ahmad";
//		customers[3][1] = "male";
//		customers[3][2] = "18";
//		customers[4][0] = "King";
//		customers[4][1] = "male";
//		customers[4][2] = "1";
//		customers[5][0] = "Rahim";
//		customers[5][1] = "male";
//		customers[5][2] = "5";
//		customers[6][0] = "nazanin";
//		customers[6][1] = "female";
//		customers[6][2] = "19";
//		for(int i=0;i<customers.length;i++) {
//		for(int j=0; j<customers[i].length;j++) {
//		System.out.print(customers[i][j] + " ");
//		}
//		System.out.println();
//		}
		
		// 3D Arrays
//		String [][][] campus = new String[2][3][3];
//		campus[0][0][0] ="cali";
//		campus[0][0][1] = "titan";
//		campus[0][0][2] = "online";
//		campus[0][1][0] ="cali";
//		campus[0][1][1] = "titan";
//		campus[0][1][2] = "inperson";
//		campus[0][2][0] = "cali";
//		campus[0][2][1] = "titan";
//		campus[0][2][2] ="hybrid";
//		campus[1][0][0] ="Va";
//		campus[1][0][1] ="tigers";
//		campus[1][0][2] ="online";
//		campus[1][1][0] ="Va";
//		campus[1][1][1] ="tigers";
//		campus[1][1][2] ="online";
//		campus[1][2][0] ="Va";
//		campus[1][2][1] ="tigers";
//		campus[1][2][2] ="online";
//		for(int i = 0; i<2;i++) {   // i< campus.lenght;i++
//		for(int j = 0 ;j<3; j++) {  // ;j<campus[i].length; j++
//		for(int k =0; k<3;k++) {    // k<campus[i][j].length;k++
//		System.out.println(campus[i][j][k] + " ");
//		}
//		System.out.println();
//		}
//		System.out.println();
//		}
		
		// -----
		
//		String [][][] campus = new String[2][3][3];
//		campus[0][0][0] ="cali";
//		campus[0][0][1] = "titan";
//		campus[0][0][2] = "online";
//		campus[0][1][0] ="cali";
//		campus[0][1][1] = "titan";
//		campus[0][1][2] = "inperson";
//		campus[0][2][0] = "cali";
//		campus[0][2][1] = "titan";
//		campus[0][2][2] ="hybrid";
//		campus[1][0][0] ="Va";
//		campus[1][0][1] ="tigers";
//		campus[1][0][2] ="online";
//		campus[1][1][0] ="Va";
//		campus[1][1][1] ="tigers";
//		campus[1][1][2] ="online";
//		campus[1][2][0] ="Va";
//		campus[1][2][1] ="tigers";
//		campus[1][2][2] ="online";
//		for(int i = 0; i<campus.length;i++) {
//		for(int j = 0 ;j<campus[i].length; j++) {
//		for(int k =0; k<campus[i][j].length;k++) {
//		System.out.println(campus[i][j][k] + " ");
//		}
//		System.out.println();
//		}
//		System.out.println();
//		}
//		
		
		/**
		 * Write a program that stores 10 values in an array
		{20,25,56,98,85,79,20,80,79,10}
		then write a logic to check if each of index values are either
		odd or not and print odd indexes?
		 */
		
//		int [] values = {20,25,56,98,85,79,20,80,79,10};
//		for(int i=0;i<values.length;i++) {
//		if(!(values[i]%2==0)) {
//		System.out.println("The value at index " +i +" is odd " + values[i]);
//		}else
//		System.out.println(values[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

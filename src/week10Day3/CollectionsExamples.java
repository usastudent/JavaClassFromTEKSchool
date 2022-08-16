package week10Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsExamples {
	public static void main(String[] args) {

		TreeSet<String> temp = new TreeSet<String>();
		
		temp.add("ab");
		temp.add("ba");
		temp.add("da");
		temp.add("0000");
		System.out.println(temp);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(5);
		nums.add(8);
		nums.add(15);
		nums.add(45);
		System.out.println(nums);
		Collections.sort(nums);
		Collections.reverse(nums);
		System.out.println(nums);

		nums.remove(2);
		nums.add(2, 100);
		System.out.println(nums);
		
		
		int [] tempNums = {1,2,5,4,8,1,3,56,4,6};
		
		for (int i : tempNums) {
			System.out.print(i + ", ");
		}
		System.out.println();
		Arrays.sort(tempNums);
		
		for (int i : tempNums) {
			System.out.print(i + ", ");
		}
		
	}
}


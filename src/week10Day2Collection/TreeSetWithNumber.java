package week10Day2Collection;


	import java.util.TreeSet;

	public class TreeSetWithNumber {
		
		public static void main(String[] args) {
			TreeSet<Integer> numbers = new TreeSet<>(); 
			numbers.add(11);
			numbers.add(65);
			numbers.add(23);
			numbers.add(51);
			numbers.add(32);
			numbers.add(154);
			
			
			for (int number : numbers) {
				System.out.print(number+",");
			}
			
		}

	}

	



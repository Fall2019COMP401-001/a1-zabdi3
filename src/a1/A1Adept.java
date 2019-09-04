package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Set up beginning scanning and arrays part like A1Novice
		// Then use A1Example of finding value min and max, etc to then print.
		
		int itemAmt = scan.nextInt();
		
		int[] itemAmtsave = new int [itemAmt];
		
		String [] itemName = new String [itemAmt];
		
		double [] itemPrice = new double [itemAmt];
		
		for (int i=0; i<itemAmtsave.length; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
			int quantItem = scan.nextInt();
			double totalItemprice = (quantItem * itemPrice[i]);
			
			//double min = findValueMin(totalItemprice);
			//double max = findValueMax(totalItemprice);
	}
		int amtCustomer = scan.nextInt();
		
		int [] amtCustomersave = new int[amtCustomer];
		
		String [] firstName = new String[amtCustomer];
		String [] lastName = new String[amtCustomer];
		
		for (int i=0; i<amtCustomersave.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			}
		int quantItem = scan.nextInt();
		
		int[] quantItemsave = new int[quantItem];
		
		// Now need a way for mathematics part... in this case (number of single item * price)
	
	
	
	}
		// 
		
		static double findValueMin(double[] vals) {
			
			// Initialize current minimum to first value in array.
			double cur_min = vals[0];
			
			// Starting with second value (if any), compare each value
			// in array with current minimum and replace if smaller.
			
			for (int i=1; i < vals.length; i++) {
				if (vals[i] < cur_min) {
					cur_min = vals[i];
				}
			}
			
			return cur_min;
		}
		
			static double findValueMax(double[] vals) {
				
				// Initialize current max to first value in array.
				double cur_max = vals[0];
				
				// Starting with second value (if any), compare each value
				// in array with current max and replace if bigger.
				
				for (int i=1; i < vals.length; i++) {
					if (vals[i] > cur_max) {
						cur_max = vals[i];
					}
				}
				
				return cur_max;	
		
		
		
		
		// System.out.println("Biggest" + ": " + String.format("%.2f", findValueMax());
		// System.out.println("Smallest" + ": " + "(" + String.format("%.2f", findValueMin());
		// System.out.println("Average" + ": " + String.format("%.2f", ));
		
		
		}
}
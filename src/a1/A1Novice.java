package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Set up scanner to find first part which is amount of customers
		// setting value of amtCustomer for first input
		
		int amtCustomer = scan.nextInt();
		
		// Now set up array to utilize the input of amount of customers...similar to A1Example
		
		int[] customerAmt = new int[amtCustomer];
		
		// set up array for other inputs (F+L names and total price of items purchased)
		// First and Last names can use String and for total price would use double (real numbers)
		// want these values since they are what is going to be printed as a result
		// Used Lect2 AvgHeight and example programs for reference
		
		String[] firstName = new String[amtCustomer];
		String[] lastName = new String[amtCustomer];
		double[] amtTotal = new double[amtCustomer];
		
		// Setup the for loop (similar to A1Exp) in order to look for the values put in
		// Remember setup of inputs... Number->String->String->Number->String->Number
		// Recall Input process: # of customers->F+L names-># total items-> # of one item->item name->price
		
		for (int i=0; i<customerAmt.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			// set up scanner to find the number of total items utilizing the array made
			
		int numitemTotal = scan.nextInt();
		
		// now want to make another array in order to save inputs related to the item.
		// ex: # of total and singular items(integer), name of the item (string), price of the item (double)
			
		int[] numItem = new int[numitemTotal];
		int[] singleItemAmt = new int[numitemTotal];
		String[] itemName = new String[numitemTotal];
		double[] itemPrice = new double[numitemTotal];
		
		// With arrays available, can now start the for loop to scan for respective values
		
		}
		
	}
}
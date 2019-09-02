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
		int [] totalnumItems = new int[amtCustomer];
		int [] amtsingleItem = new int[amtCustomer];
		double [] itemPrice = new double[amtCustomer];
		
		
		// Setup the for loop (similar to A1Exp) in order to look for the values put in
		// Remember setup of inputs... Number->String->String->Number->String->Number
		// Recall Input process: # of customers->F+L names-># total items-> # of one item->item name->price
		
		for (int i=0; i<customerAmt.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			totalnumItems[i] = scan.nextInt();
			amtsingleItem[i] = scan.nextInt();
			itemPrice[i] = scan.nextDouble();
					
		// Now want to set up math part for getting total price for each item
		// Create an array to store the number (in this case a double) then set up calculation
		
			
			double itemTotalPrice = (amtsingleItem[i] * itemPrice[i]);
		
		// Now close scanner
		
		scan.close();
		
		
		// Now to set up printing values
		// Use CharAt(0) to get the first letter of the string-> period, last name, then colon, total price.	
		// Used Print part in A1Example as a reference
		
	
		System.out.println(firstName[i].charAt(0) + ". " + lastName[i] + ": " + String.format("%.2f", itemTotalPrice));}}    
			}
			
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
		
		String[] firstName = new String[amtCustomer];
		String[] lastName = new String[amtCustomer];
		double[] amtTotal = new double[amtCustomer];
		
		// Setup the for loop (similar to A1Exp) in order to look for the values put in
		// Remember setup of inputs... Number->String->String->Number->String->Number
		
		for (int i=0; i<customerAmt.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			
		
				
		}
		
	}
}
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
		double[] itemTotalPrice = new double[amtCustomer];
		
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
				
				
				
				// With arrays available, can now start the for loop to scan for respective item values...use j.
				
				for (int j=0; j<numItem.length; j++) {
					singleItemAmt[j] = scan.nextInt();
					//itemName[j] = 
					scan.next();
					itemPrice[j] = scan.nextDouble();
				
				scan.close();
					
				// Now want to set up math part for getting total price for each item
				// Create an array to store the number (in this case a double) then set up calculation
				//double[] itemTotalPrice = new double[numitemTotal]	
					itemTotalPrice[j] += (singleItemAmt[j] * itemPrice[j]);
					
					
				// now want to set up getting Complete total for each customer
				// can use the end of A1Example to get the sum of prices of all items; method type so "static" needed
				//	set up definition using array spot made in line 27
			
					
				}
				
				
				double amtTotalBeta = calcValueSum(itemTotalPrice);
				for (int k = 0; k <=customerAmt.length; k++) {
		            System.out.println(firstName[i].charAt(0) + ". " + lastName[i] + ": " + String.format("%.2f", amtTotalBeta));
		        	
				}	
			}	
	}		
				// Now to set up printing values
				// Use CharAt(0) to get the first letter of the string-> period, last name, then colon, total price.	
				// Used Print part in A1Example as a reference
					
	
					
				
				
			

			private static double calcValueSum(double[] vals) {
				/* calcValueSum 
				 * Calculates the sum on an array of doubles (prices in this case)
				 *
				 * Input: array of integers vals
				 * Output: integer sum of values in vals
				 * 
				 * Preconditions: Input array must not be null.
				 */	 
				
				double sum = 0.0;
			
				for (int i=0; i<vals.length; i++) {
					sum += vals[i];
				}	
				return sum;
				
			}
		}
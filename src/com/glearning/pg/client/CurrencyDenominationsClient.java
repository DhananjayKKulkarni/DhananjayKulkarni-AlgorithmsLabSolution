package com.glearning.pg.client;

import java.util.Scanner;
import com.glearning.pg.model.BubbleSort;
	
/*
 * Question - 2
	You are a traveler and traveling to a country where the currency denominations are
	unknown and as you travel, you get to know about the denomination in random order.
	You want to make a payment of amount x, in such a way that the number of notes you give
	is minimum. 
 */

public class CurrencyDenominationsClient {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cdSize;								// Currency Denomination size
		int[] cdArray;							// Array to store currency denominations values
		int amtPay ;							// Amount to pay
		int tempAmountPay = 0; 
		int amtAccumulator ;
		System.out.println("Enter the size of currency denominations");
		cdSize= scanner.nextInt();									
		
		System.out.println("Enter the currency denominations value");
		cdArray = insertArrayValues(cdSize);						
				
		System.out.println("Enter the amount you want to pay");
		amtPay = scanner.nextInt();
		
		cdArray = BubbleSort.bubbleSort(cdArray); 	 //sort the array in descending order	
		int[] arrDenominations = new int[cdSize];
		amtAccumulator = amtPay ;
		if(amtAccumulator != 0) {
			for(int i =0; i< cdSize; i++) {
				if(amtAccumulator >= cdArray[i]) {
					arrDenominations[i] = amtAccumulator / cdArray[i];
					amtAccumulator = amtAccumulator % cdArray[i];
				}
			}
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be: ");
		for(int i=0; i< arrDenominations.length; i++) {
			if(arrDenominations[i] != 0) {
				System.out.println( cdArray[i] + " : " +arrDenominations[i]);
				tempAmountPay = tempAmountPay + (cdArray[i] * arrDenominations[i]);
			}
		}
		
		if ( tempAmountPay < amtPay) {
			System.out.println("\nUnable to pay complete amount using provided denominations.");
			System.out.println("Amount which cannot be paid using provided denominations is : " + (amtPay-tempAmountPay));
		}
		scanner.close();		
	}
	
	// Method accepts number as array size and returns Array of interger 
	protected static int[] insertArrayValues(int arraySize) {
		int[] outputArray= new int[arraySize];
		for(int i=0; i<arraySize; i++) {
			outputArray[i] = scanner.nextInt();
		}
		return outputArray;
	}
}

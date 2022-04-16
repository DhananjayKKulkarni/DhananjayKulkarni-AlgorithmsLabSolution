package com.glearning.pg.model;

import java.util.Scanner;

public class PayMoneyServices {
	public Scanner arrElementScanner = new Scanner(System.in);
	
	// Method to calculate return number of transactions required to achieve the target
	 
	public int noOfTransactionsRequired(int[] transactions, int target) {
		
		int accumulator =0;
		for(int i= 0; i< transactions.length; i++) {
			
			accumulator = accumulator + transactions[i];
			if(accumulator >= target) {
				return i+1;
			} 
		}
		return -1;
		
	}
	
}

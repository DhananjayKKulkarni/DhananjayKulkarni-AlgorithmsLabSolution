package com.glearning.pg.client;
import java.util.Scanner;

import com.glearning.pg.model.PayMoneyServices;

/*
 * Tried to match the input and output exactly as displayed in problem statement
 * Question -1
  		PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They
		also have a daily target that they must achieve. Given a list of transactions done by
		PayMoney and a daily target, your task is to determine at which transaction PayMoney
		achieves the same. If the target is not achievable, then display the target is not achieved.
 */

public class PayMoneyClient {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		int noTransactions = scanner.nextInt();
		
		int[] arrTransaction = insertTranArray(noTransactions);  // Creates Transaction array of noTransactions values 
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noofTargets = scanner.nextInt();
			
		PayMoneyServices objPMS = new PayMoneyServices();
			
		for (int i=0; i<noofTargets; i++)
		{
			System.out.println("Enter the value of target");
			int targetValue = scanner.nextInt();
			int reqTransactions = objPMS.noOfTransactionsRequired(arrTransaction, targetValue);
			
			if(reqTransactions == -1) {
				System.out.println("Given target is not achieved\n");
			} else {
				System.out.println("Target achieved after "+ reqTransactions + " transactions\n");
			}
		}
		scanner.close();
	}
	
	// Method accepts size parameter and creates Array and returns array of the provided length
	
	public static int[] insertTranArray(int arrElementCount) {
		
		int[] arrTrans = new int[arrElementCount];
		
		System.out.println("Enter the values of array");
		for(int i=0; i< arrElementCount; i++) {
			arrTrans[i] = scanner.nextInt();
		}
		return arrTrans;		
	}
}

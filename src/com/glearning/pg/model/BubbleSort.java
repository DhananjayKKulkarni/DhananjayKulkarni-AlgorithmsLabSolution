package com.glearning.pg.model;

public class BubbleSort {
	
	// Method to sort the array in descending order
    public static int[] bubbleSort(int[] cdArr) {  
        int arrSize = cdArr.length;
        int temp = 0;  
         for(int i=0; i < arrSize; i++){  
                 for(int j=1; j < (arrSize-i); j++){  
                          if(cdArr[j-1] < cdArr[j]){  
                                 //swap elements  
                                 temp = cdArr[j-1];  
                                 cdArr[j-1] = cdArr[j];  
                                 cdArr[j] = temp;  
                         }  
                 }  
         } 
        return cdArr; 
    }
}

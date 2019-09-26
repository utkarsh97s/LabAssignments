package com.cg.labexercise;
import java.util.Arrays; 

public class  SecondSmallestNumber {
	
	public static int secondSmallestNumber(int[] array) {
		Arrays.sort(array); 
		for(int i = 0;i< array.length-1;i++) {
			if(array[i+1]>array[i]) {
				return array[i+1];
			}
			
		}
		return -1;
	}


public static void main(String args[]) {
	int[] array2= {1,1,1,1,1};
	
	if (secondSmallestNumber(array2) ==-1) {
		System.out.println("All numbers are equal");
	}
	else {
		System.out.println(secondSmallestNumber(array2));
	}
	
	
	
}
}
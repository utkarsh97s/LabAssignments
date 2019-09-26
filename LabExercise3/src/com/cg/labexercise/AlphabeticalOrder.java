package com.cg.labexercise;

import java.util.Arrays;

public class AlphabeticalOrder {
	public static String[] alphabeticalOrder(String [] array) {
		Arrays.sort(array);
		if((array.length)%2==0) {
			for(int i=0;i<((array.length)/2);i++) {
				array[i]=array[i].toUpperCase();
			}
			for(int i=((array.length)/2);i<(array.length)-1;i++) {
				array[i]=array[i].toLowerCase();
			}
			
		}
		else {
			for(int i=0;i<((array.length+1)/2);i++) {
				array[i]=array[i].toUpperCase();
			}
			for(int i=((array.length+1)/2);i<(array.length);i++) {
				array[i]=array[i].toLowerCase();
			}
			
		}
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"pLaa","maa","seE","low","9yePq"};
		String[] array2 = alphabeticalOrder(array1);
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		
		
		

	}

}

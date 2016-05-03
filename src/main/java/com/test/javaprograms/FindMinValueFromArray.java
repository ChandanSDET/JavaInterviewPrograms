package com.test.javaprograms;

public class FindMinValueFromArray {

	public static void main(String[] args) {
		int array[] = {10,33,2,97,500};
		int minValue = array[0];
		for(int i = 1;i<array.length;i++){

			if(minValue>array[i]){

				minValue = array[i];
			}
		}
		System.out.println("Min vaue present in array is: "+minValue);
	}
}



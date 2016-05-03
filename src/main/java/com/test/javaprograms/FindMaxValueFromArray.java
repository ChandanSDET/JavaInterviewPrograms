package com.test.javaprograms;

public class FindMaxValueFromArray {

	public static void main(String[] args) {
		int array[] = {10,33,2,97,500};
		int maxValue = array[0];
		for(int i = 1;i<array.length;i++){

			if(maxValue<array[i]){

				maxValue = array[i];
			}
		}
		System.out.println("Max vaue present in array is: "+maxValue);
	}

}

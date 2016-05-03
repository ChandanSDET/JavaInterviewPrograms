package com.test.javaprograms;

import java.util.Scanner;

public class RemoveDuplicateCharactersFromString {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Enter any word to remove duplicate: "); 
		String str=sc.nextLine();
		char ch;
		String ans = "";

		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			if(ch!=' ')
				ans = ans + ch;
			str = str.replace(ch,' '); //Replacing all occurrence of the current character by a space
		}

		System.out.println("Word after removing duplicate characters : " + ans);
	}
}



package me.mc.ChapterSix;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/20/20
 * 
 * Contents: Chapter 6 homework, E6.12
 * 
 * Function: Reads a word, prints all substrings, sorted by length
 * 
 * 
 *************************************************/
public class PrintSubstring {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Class variables
		String stringInt;

		Scanner in = new Scanner(System.in);
		//Inputs string
		System.out.print("Please input a string\n");
		stringInt = in.next();
		
		//n = length of stirng
		int n = stringInt.length();
		
		//variable len, when len is less than length of string, increase by 1
		for (int len = 1; len <= n; len++) {
			
	        // Pick ending point
			//variable i, when i is less than or equal to length of string minus len, increase by 1
			/*
			 * So, when n = 3 and len = 2, i increases by 1,
			 * but when n = 3 and len = 3, and i < 0, i will not increase
			 */
	        for (int i = 0; i <= n - len; i++) {
	        	// Print characters from current starting point to current ending point. 
	            int j = i + len - 1;
	            for (int k = i; k <= j; k++) {
	                    System.out.print(stringInt.charAt(k));
	            }
	    
	                System.out.println();
	        }
	    }
		
	}
}

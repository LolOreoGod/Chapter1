package me.mc.ChapterFour;


import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, E4.16
 * 
 * Function: Takes input of a positive digit and breaks it into a sequence of individual digits
 * 
 * 
 *************************************************/

public class SeperateIntegers {
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Class virables
		int myInt;
		String stringInt;

		//Input of an integer
		Scanner in = new Scanner(System.in);
		System.out.print("Please input an integer of up to 5 characters\n");
		myInt = in.nextInt();
		stringInt = Integer.toString(myInt);
		
		
		
		//Prints digits seperately with a for loop
		for (int i = 0; i < stringInt.length(); i++) {
			System.out.print(stringInt.charAt(i) + " ");
			
		
		}
	}
		
}



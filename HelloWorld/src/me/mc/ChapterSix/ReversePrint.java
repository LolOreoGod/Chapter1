package me.mc.ChapterSix;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/20/20
 * 
 * Contents: Chapter 6 Homework. E6.10
 * 
 * Function: Takes a string input and reverses it
 * 
 * 
 * 
 *************************************************/

public class ReversePrint {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Class variables
		String stringInt;

		Scanner in = new Scanner(System.in);
		System.out.print("Please input a string\n");
		stringInt = in.next();
		
		
		
		//Prints digits seperately with a for loop
		for (int i = stringInt.length() - 1; i < stringInt.length() && i != -1; i--) {
			System.out.print(stringInt.charAt(i) + " ");
			
		
		}
	}

}

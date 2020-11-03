package me.mc.Classwork_11_2;

import java.util.Arrays;
import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/2/20
 * 
 * Contents: Classwork for 11/2 E5.21
 * 
 * Function: Prints three inputted strings after sorting them lexicographically
 * 
 *
 * 
 *************************************************/

public class LexicoSort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		//Takes user input for three strings
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 3 strings:\n" );
		
		
		String[] myStrgs = {"", "", ""};
		
		//Assigns strings to an array
		myStrgs[0] = in.next();
		myStrgs[1] = in.next();
		myStrgs[2] = in.next();
		
		//Array is sorted in lexicographical order
		Arrays.sort(myStrgs);

		//Sorted array is printed
		System.out.println(myStrgs[0] + "\n" + myStrgs[1] + "\n" + myStrgs[2]);
	}


	
}

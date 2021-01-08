package me.mc.ChapterSeven_Five;

import java.util.ArrayList;
import java.util.Random;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 1/7/21
 * 
 * Contents: Chapter 7 Hw 5, E7.11
 * 
 * Function: Generates a sequence of 20 random values between 0 and 99 in an array, prints the sequence, sorts it, and prints the sorted sequence
 *
 *
 *************************************************/
public class E7_15 {
	
	
	public static void main(String[] args) {
		
		final int VALUES = 20;
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		Random r = new Random();
		
		//Generates an arraylist with 20 values ranging from 1-99. 
		for(int i = 0; i < VALUES; i++) {
			
			//100 is the bound. It is not included
			int temp = r.nextInt(100);
			array.add(temp);
		}
		
		//Prints array as string (before sorting)
		System.out.println("Before sort: " + array.toString());
		
		//Sorts array
		array.sort(null);
		
		//Prints sorted array as string
		System.out.println("Sorted: " + array.toString());
		
	}

	
	


}

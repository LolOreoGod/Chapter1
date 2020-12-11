package me.mc.ChapterSeven;


import java.util.Random;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/10/20
 * 
 * Contents: Chapter 7 homework
 * 
 * Function: Generates an integer array of 10 elements and prints every element at an even index, every even element, all elements in reverse order, and the first and last element
 * 
 * 
 *************************************************/

public class E7_1 {

	public static void main(String[] args) {
		
		/*
		 * Generates an integer array of 10 random integers
		 */
		Random rand = new Random();
		
		int[] myArray = new int[10];
		final int LENGTH = myArray.length;
		
		
		for(int i = 0; i < LENGTH; i++ ) {
			myArray[i] = rand.nextInt();
		}
		
		/*
		 * Prints every element in order. USED TO CHECK OTHER RESULTS
		 */
		for(int i = 0; i < LENGTH; i++ ) {
			System.out.println("Items in array in order: " + myArray[i]);
		}
		
		/*
		 * Prints every element at an even index
		 */
		for(int i = 0; i < LENGTH; i++) {
			if(i % 2 == 0) {
				System.out.println("Every element at an even index: " + myArray[i]);
			}
		}
		
		/*
		 * Prints every even element in array
		 */
		for(int i = 0; i < LENGTH; i++ ) {
			if(myArray[i] % 2 == 0) {
				System.out.println("Every even element: " + myArray[i]);
			}
		}
		
		/*
		 * Prints elements in array in reverse order
		 */
		for(int i = LENGTH - 1; i >= 0; i--) {
			System.out.println("Elements in reverse order: " + myArray[i]);
		}
		
		/*
		 * Prints first and last element in array
		 */
			System.out.println("First element: " + myArray[0]);
			System.out.println("Last element: " + myArray[LENGTH - 1]);
		
		
		
	}
	
}

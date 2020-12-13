package me.mc.ChapterSeven;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/12/20
 * 
 * Contents: Chapter 7 homework
 * 
 * Function: Change an array by reversing the sequence of elements
 * Methods:
 * 	getArray: returns array
 * 	getReverse: returns array in reverse order
 * 
 * 
 *************************************************/


public class E7_6 {
	private int[] myArray = new int[9];
	private final int LENGTH = myArray.length;
	private Random rand = new Random();
	
	/*
	 * @returns array as string
	 */
	public String getArray(int[] myArray) {
		this.myArray = myArray;
		for(int i = 0; i < LENGTH; i++ ) {
			myArray[i] = rand.nextInt(15);
		}
		
		return Arrays.toString(myArray);
	}
	
	/*
	 * @returns array in reverse by swapping values in the first half to the second half
	 */
	public String getReverse(int[] myArray) {
		for (int left = 0, right = myArray.length - 1; left < right; left++, right--) {
			// swap the values at the left and right indices
			int temp = myArray[left];
			myArray[left]  = myArray[right];
			myArray[right] = temp;
		}
		
		this.myArray = myArray;
		return Arrays.toString(this.myArray);
	}
}

class E7_6Tester {
	public static void main(String[] args) {
		int[] newArray = new int[9];
		E7_6 myObj = new E7_6();
		System.out.println(myObj.getArray(newArray));
		System.out.println(myObj.getReverse(newArray));	
	}
}

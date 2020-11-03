package me.mc.Classwork_11_2;

import java.util.Arrays;
import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/2/20
 * 
 * Contents: Classwork for 11/2 E5.20
 * 
 * Function: Prints the largest floating point number from 3 inputted numbers
 * 
 *
 * 
 *************************************************/

public class PrintLarger {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Takes user input for 3 numbers
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter three numbers: ");
		
		
		double[] myNums = {0, 0, 0};
		
		//Assigns each input to an array element
		myNums[0] = in.nextDouble();
		myNums[1] = in.nextDouble();
		myNums[2] = in.nextDouble();
		
		
		//Sorts the array into numerical order
		Arrays.sort(myNums);
		
		//prints the last number in the array (largest)
		double lastNum = myNums[myNums.length-1];
		System.out.println("The largest number is: " + lastNum);
			
	}

}

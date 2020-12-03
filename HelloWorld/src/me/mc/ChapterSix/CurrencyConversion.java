package me.mc.ChapterSix;

import java.util.Scanner;
/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/30/20
 * 
 * Contents: Chapter 6 homework, E6.20
 * 
 * Function: Takes input for today's price for one dollar in Japanese yen. Then reads U.S. dollar values and converts each to yen. 0 is a sentinel value.
 * 
 * 
 *************************************************/
public class CurrencyConversion {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//Converter
		System.out.println("What's today's price for one dollar in Japanese yen?");
		final double CONVERTER = in.nextDouble();

		//Input for U.S. dollar values
		System.out.println("List all U.S. dollar values you wish to be converted to yen");
		

		boolean done = false;
		
		
		while (!done) {
			double value = in.nextDouble();
			//Sentinel value = 0
			if (value == 0) {
				break;
			
			}
			//Returns dollar values converted to yen
			else {
				double yenValue = value * CONVERTER;
				System.out.println("In yen: " + yenValue);
				
			}
		}
		
		
		
	}

}

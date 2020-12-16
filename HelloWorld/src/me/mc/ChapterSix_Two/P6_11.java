package me.mc.ChapterSix_Two;


import java.util.Scanner;
/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/15/20
 * 
 * Contents: Chapter 6 projects, P6.11
 * 
 * Function: A program that reads the target price, then the current stock price, until it is at least the target price. Once minimum is reached, program reports
 * that the stock price exceeds target price
 * 
 * 
 * 
 * 
 * 
 *************************************************/

public class P6_11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		//SETS TARGET PRICE
		System.out.print("Please input target price: ");
		double targetPrice = in.nextDouble();

		//Allows user to continuously feed the current stock price until it meets the specified condiiton
		System.out.println("Please input current stock price: ");
		while(in.hasNextDouble()) {
			
			double stockPrice = in.nextDouble();
			//if stock price is greater than or equal to target price, program exits. 
			if(stockPrice >= targetPrice) {
				System.out.println("The stock price is equal to or exceeds target price!");
			}
		}
		
	}
	
	
}

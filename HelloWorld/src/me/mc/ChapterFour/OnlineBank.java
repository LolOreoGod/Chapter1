package me.mc.ChapterFour;

import java.util.ArrayList;
import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, P4.10
 * 
 * Function: Takes an initial balance and annual interest rate in percent input. Returns balances after three months of interest being compounded monthly
 * 
 * 
 *************************************************/


public class OnlineBank {
	static double p;
	static double r;
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args){

		ArrayList<Double> list = new ArrayList<Double>();
		try {
			//USER INPUT FOR INITIAL BALANCE AND ANNUAL INTEREST RATE
			Scanner scan = new Scanner(System.in);
			System.out.println("Initial starting $:");
			p = scan.nextDouble();
			System.out.println("Interest rate:");
			r = scan.nextDouble();
			int n = 12;
			double amount;

				/*
				 * p = initial
				 * r = interest rate
				 * n = number of times interest applied per time period
				 * t = number of time periods elapsed
				 */
			
			for (int t = 0; t < 4; t++ ) {
				amount = p * Math.pow((1 + r/n), n * t);
				//p * Math.pow(1 + (r/n), n * t) -> standard compounded interest formula
				list.add(amount);
			
				}
			
		}
		catch(Exception e)
		{}
			System.out.println("Initial balance: " + p);
			System.out.println("Annual interest rate in percent: " + r*100);
			System.out.printf("%-22s%s", "After first month: ", list.get(1));
			System.out.printf("\n%-22s%s", "After second month: ", list.get(2));
			System.out.printf("\n%-22s%s", "After third month: ", list.get(3));
			}
		
		
		}



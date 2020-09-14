package me.mc.ChapterOne;


import java.util.Scanner;

public class CompoundedInterest {
	

	@SuppressWarnings("resource")
	public static void main(String[] args){
		//THIS IS FOR R1.14
		try 
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Initial starting $:");
			double p = scan.nextDouble();
			System.out.println("Interest rate:");
			double r = scan.nextDouble();
			System.out.println("How many times interest is applied per year");
			int n = scan.nextInt();
				// System.out.println("# of years passed");
				// int t = scan.nextInt();
			System.out.println("Monthly deposit. Negative for withdrawl");
			int w = scan.nextInt();
				/*
				 * p = initial
				 * r = interest rate
				 * n = number of times interest applied per time period
				 * t = number of time periods elapsed
				 */
			double amount = p;
			for (int t = 1; amount > 0; t++ ) {
				amount = p * Math.pow(1 + (r/n), n * t) + (w * 12 * t);
				// p*(1+r/n)^nt
				//p * Math.pow(1 + (r/n), n * t) -> standard compounded interest formula
				//(w * 12 * t); -> monthly withdraw or deposit formula
				System.out.println(amount + "is left after " + t + "years.");
			
				}
			}
		catch(Exception e)
		{}
		}


}

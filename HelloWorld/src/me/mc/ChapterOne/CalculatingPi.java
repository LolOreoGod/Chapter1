package me.mc.ChapterOne;

public class CalculatingPi {
	// FOR P1.3
	public static double round(double x, int n)
	{
	    double exp = Math.pow(10, n);
	    return Math.round(x * exp) / exp;
	    //Constructor for rounding to n decimal places
	}
	
	public static void main(String[] args) {
		double sum = 1;
		int sign = -1;
		//inverse signs
		double value = 3;
		//what denominator starts out with, other than 1
		while (value < 10_000_000) {
			sum = sum + sign / value;
			value = value + 2;
			sign = sign * -1;
			//loop de loop 
		}
		
		double pi = 4 * sum; 
			//Isolating pi
		
		System.out.println("The value of pi is " + round(pi, 6));
	}
}

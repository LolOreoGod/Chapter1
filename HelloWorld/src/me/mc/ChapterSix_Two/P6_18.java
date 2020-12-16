package me.mc.ChapterSix_Two;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/15/20
 * 
 * Contents: Chapter 6 projects, P6.18
 * 
 * Function: A program that models the circuit shown & varies the turn ratio from 0.01 to 2 in 0.01 increments. Then it determines the value of turn ratio that outputs maximum power
 * 
 * 
 *************************************************/

public class P6_18 {

	private static double turnRatio = 0.01;
	
	public static void main(String[] args) {
		
		System.out.println("Most efficient turn ratio value: " + getBest(20, 8, 40));
		
	}
	
	
	public static double getBest(double r0, double rs, double v) {
		double p = 0;
		double turnRatio = 0;
		//Iterates through turnratio values 0.01 to 2.00
		for(double i = 1; i <= 200; i++) {
			turnRatio = i / 100.0;
			
			//Makes equation more readable
			double num = (turnRatio * v);
			double denom = ((Math.pow(turnRatio, 2) * r0) + rs);
			
			//Equation simplified
			double temp = rs * (Math.pow((num / denom), 2));
			
			//Stores temporary value as power, p. and compares each value until the highest is reached.
			if (temp > p) {
				p = temp;
				P6_18.turnRatio = turnRatio;
			}
		}
		
		
		return P6_18.turnRatio;
	}
	
	
	
	
	
}

package me.mc.ChapterFour;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, P4.17
 * 
 * Function: Calculates force on charged particles, based on user input of Q1 Coulombs, Q2 Coulombs, and r meters
 * 
 *
 * 
 *************************************************/
public class ChargedParticles {

	//value of e in the equation
	final static double e = 8.854 * Math.pow(10, -12);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//user input for Q1 Q2 and r
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input Q1 Coulombs: ");
		double q1 = in.nextDouble();
		System.out.println("Input Q2 Coulombs: ");
		double q2 = in.nextDouble();
		System.out.println("Meters apart: ");
		double r = in.nextDouble();
		
		//EQUATION: F = (q1 * q2)/4*pi*e*r^2
		
		double f = (q1 * q2) / 4 * Math.PI * e * Math.pow(r, 2);
		
		System.out.println("Electric force: " + f);
		
		
	}
	
	
}

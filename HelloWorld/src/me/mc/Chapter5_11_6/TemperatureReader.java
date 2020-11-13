package me.mc.Chapter5_11_6;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/13/20
 * 
 * Contents: Chapter 5 Classwork, E5.13
 * 
 * Function: Reades whether a temperature value means water is liquid, solid, or gaseous. +Custom altitude +Error handling
 * 
 * Methods:
 * 
 * compareTo: 
 *
 * 
 *************************************************/
import java.util.Scanner;

public class TemperatureReader {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		
		/*
		 * User input degrees and unit
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature in degrees: ");
		if (in.hasNextInt()) {
			int degrees = in.nextInt();
			System.out.println("Is the degree in Fahrenheit or Celsius?");
			String unit = in.next();
			
			/*
			 * Is the unit valid?
			 */
			if(unit.matches("[CFcf]{1}")) {
				
				System.out.println("What's the altitude in feet?: ");
				if(in.hasNextDouble()) {
					double altitude = in.nextDouble();
					final double C_BOILING_POINT = 100 - 1 * (altitude/1000);
					final double C_FREEZING_POINT = 0;
					final double F_BOILING_POINT =  (100 - 1 * (altitude/1000)) * 9 / 5 + 32 ;
					//212
					final double F_FREEZING_POINT = 32;
					
					
				
					/*
					 * Fahrenheit
					 */
					if(unit.equalsIgnoreCase("f")) {
						/*
						 * Liquid
						 */
						if(degrees < F_BOILING_POINT && degrees > F_FREEZING_POINT) {
							System.out.println("Liquid");
							System.out.println(F_BOILING_POINT);
						}
					
						/*
						 * Frozen
						 */
						if(degrees <= F_FREEZING_POINT) {
							System.out.println("Solid");
						}
					
						/*
						 * Boiling
						 */
						if(degrees >= F_BOILING_POINT) {
							System.out.println("Gaseous");
							System.out.println(F_BOILING_POINT);
						}
					
					}
				
					/*
					 * Celsius
					 */
					if(unit.equalsIgnoreCase("c")) {
						/*
						 * Liquid
						 */
						if(degrees < C_BOILING_POINT && degrees > C_FREEZING_POINT) {
							System.out.println("Liquid");
						}
					
						/*
						 * Frozen
						 */
						if(degrees <= C_FREEZING_POINT) {
							System.out.println("Solid");
						}
						
						/*
						 * Boiling
						 */
						if(degrees >= C_BOILING_POINT) {
							System.out.println("Gaseous");
						}
					
					}
					
				}
				else {
					System.out.println("Please input a valid altitude");
				}
				
				
				}
			else {
				System.out.println("Please input a valid unit of temperature. Celsius, or Fahrenheit.");
			}
			
			
			
		}
		else {
			System.out.println("Please input a valid number");
		}
		
		
		
		
		
	}
	

}

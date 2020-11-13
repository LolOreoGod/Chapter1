package me.mc.ChapterFour;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, E4.8
 * 
 * Function: Takes input width and length. Prints the area and perimeter of the rectangle. Prints the length of the diagonal
 * 
 * 
 *************************************************/

public class RectangleCalculations {

	/*
	 * Class variables
	 */
static double width;
static double length;
static double area;
static double perimeter;
static double diagonal;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the width of the rectangle\n");
		width = in.nextDouble();
		System.out.print("Enter the length of the rectangle\n");
		length = in.nextDouble();
		
		//Mathematical calculations for area, perimeter, and diagonal
		area = width * length;
		perimeter = 2 * width + 2 * length;
		diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
		
		//Printing results
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		System.out.println("Diagonal: " + diagonal);
		
		//Expected results
		System.out.println("\nFor an input of width = 2 and length = 3, the expected outputs are:");
		System.out.println("Perimeter: 10 \nArea: 6 \nDiagonal: 3.60555");
		
	}
	
}

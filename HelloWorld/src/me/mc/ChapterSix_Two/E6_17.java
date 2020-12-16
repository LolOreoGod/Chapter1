package me.mc.ChapterSix_Two;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/15/20
 * 
 * Contents: Chapter 6 projects, E6.17
 * 
 * Function: A program that prints a multiplication table
 * 
 * 
 * 
 *************************************************/


public class E6_17 {

	public static void main(String[] args) {
		
		//maximum position of rows + 1
		final int MAX = 11;
		for(int row = 1; row < MAX; row++) {
			//for every row, multiply the column by the row, starting from 1, as long as column < max * row, in this case, 100
			//after every loop, add the row number to the column... 
			//this loop goes from row = 1, iterates through all column values, then row++. 
			for(int column = 1 * row; column < MAX * row; column+=row) {
				
				//prints multiplication table with some nicer formatting
				System.out.printf("%-4d", column);
			}
			
			
			System.out.println();
		}
	}
	
	
}

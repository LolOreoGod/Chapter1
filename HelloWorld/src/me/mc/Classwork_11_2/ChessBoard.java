package me.mc.Classwork_11_2;

import java.util.Scanner;
/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/2/20
 * 
 * Contents: Classwork for 11/2, R5.10 & R5.11
 * 
 * Function: Prints whether the inputted square on a chess board is black or white
 * 
 *
 * 
 *************************************************/

public class ChessBoard {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Takes user input for the letter and number of chess square
		Scanner in = new Scanner(System.in);
		
		String color;
		System.out.print("Insert the letter: ");
		String letter = in.next();
		System.out.print("Insert the number: ");
		int number = in.nextInt();
		
		//conditional if letter is a,c,e, or g
		
		if (letter == "a" || letter == "c" || letter == "e" || letter == "g") {
			//parent condition + conditional if the number is odd
			if(number % 2 != 0) {
				color = "black";
			}
			//parent condition + conditional if number is even
			else {
				color = "white";
			}
		}
		
		//conditional if letter is NOT a,c,e or g
		
		else {
			//conditional if the number is even
			if(number % 2 == 0) {
				color = "black";
			}
			//conditional if number is odd
			else {
				color = "white";
			}
		}
		
		System.out.println(color);
		//g5 = black
		//g4 = white
		//f5 = white
		//f4 = black
		
	}

}

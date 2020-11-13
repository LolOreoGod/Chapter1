package me.mc.Chapter5_11_6;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/13/20
 * 
 * Contents: Chapter 5 Classwork, E5.23
 * 
 * Function: Prompt the user to provide a single character from the alphabet. Print vowel or consonant depending on the input
 * 
 *
 * 
 *************************************************/

public class PrintLetter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Scanning input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character of the alphabet: ");
		String letter = in.next();
		
		
		//Checks if input includes letters in the alphabet & only contains 1 character
		if (letter.matches("[A-Za-z]{1}")) {
	
			//checks if the input is a vowel (AEIOU)
			if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
					System.out.println("This is a vowel!");
			}
			//if input is not a vowel
			else {
					System.out.println("This is a consonant!");
			}
			
			
		}
		//If input does not include letters of the alphabet or is more than 1 character
		else {
			letter = "";
			System.out.println("Error: Please enter a single character of the alphabet");
		}
		
	
	}
}

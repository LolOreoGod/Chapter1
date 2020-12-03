package me.mc.ChapterSix;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/02/20
 * 
 * Contents: Chapter 6 homework, E6.11
 * 
 * Function: Reads a word. Prints the number of vowels in the word
 * 
 * 
 *************************************************/
public class VowelPrinter {
	
	public static void main(String[] args) {
		int vowels = 0;
		
		//Scans for input
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = in.next();
		
		
		//Iterates through every letter
		for (int i = 0; i < word.length(); i++) {
			//Finds character at current spot
			char current = word.charAt(i);
			//Converts it to string
			String currentString = Character.toString(current);
			//Condition to check if it is a vowel
			if(currentString.contains("a") || currentString.contains("e") || currentString.contains("i") || currentString.contains("o") || currentString.contains("u") || currentString.contains("y")) {
				vowels++;
				
			}
			
		}
		
		System.out.println("Total vowels in word: " + vowels);
		
	}

}

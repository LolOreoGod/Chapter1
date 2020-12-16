package me.mc.ChapterSix_Two;


import java.util.ArrayList;
import java.util.Scanner;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/15/20
 * 
 * Contents: Chapter 6 projects, E6.4
 * 
 * Function: A program that reads a line of input as a string and prints only the uppercase letters, every second letter, the string with all vowels replaced by an underscore,
 * the number of vowels in the string, and the position of all vowels in the string.
 * 
 * Methods:
 * 	getUppercase: returns all uppercase letters in string
 * 	getSeconds: returns every second character in string
 * 	noVowels: replaces all vowels in string with a _ and returns result
 * 	countVowels: returns count of number of vowels in string
 * 	getVowelPositions: returns position of all vowels in string
 * 
 *************************************************/

public class E6_4 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		System.out.println("Uppercase letters: " + getUppercase(input));
		System.out.println("Every second letter: " + getSeconds(input));
		System.out.println("String but with no vowels: " + noVowels(input));
		System.out.println("# of vowels: " + countVowels(input));
		System.out.println("Position of vowels starting from [0]: " + getVowelPositions(input));
	}
	
	
	/*
	 * @returns all uppercase letters
	 */
	public static String getUppercase(String s) {
		//uses a string builder to build new string of only uppercase letters
	    final StringBuilder builder = new StringBuilder();
	    for(final char c : s.toCharArray()) {
	    	//checks if char c is uppercase
	        if(Character.isUpperCase(c)) {
	            builder.append(c);
	        }
	    }
	    //returns the new string
	    return builder.toString();
	}
	
	
	/*
	 * @returns every second character of the string
	 */
	public static String getSeconds(String s) {
		//uses stringbuilder to build new string containing every second character of the string
		final StringBuilder builder = new StringBuilder();
		//Iterates through the string by 2, starting from 2nd character
		for(int i = 1; i < s.length(); i+=2) {
			char c = s.charAt(i);
			builder.append(c);
			
		}
		//returns new string
		return builder.toString();
		
	}
	
	
	/*
	 * @returns string with all vowels replaced with _
	 */
	public static String noVowels(String s) {
		//Using a built in class. (?i) means case sensitive
        s = s.replaceAll( "(?i)[aeiouy]", "_" );
		return s;
	}
	
	
	/*
	 * @returns number of vowels in the string
	 */
	public static int countVowels(String s) {
		int vowels = 0;
		//for every character in string, check if it is a vowel, if it is, add 1 to the vowel counter
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//ensures character is lowercase so it passes if condition
			c = Character.toLowerCase(c);
			if(c == 'a' || c == 'e' ||
			   c == 'i' || c == 'o' ||
			   c == 'u' || c == 'y') {
			
				vowels++;
			}
		}
		return vowels;
		
	}
	
	
	/*
	 * @returns position of all vowels in string
	 */
	public static String getVowelPositions(String s) {
		//Uses an array list to keep track of positions
		ArrayList<Integer> vowelPosition = new ArrayList<Integer>();
		//for every character, if it is a vowel, add it to the array list.
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			//ensures character is lowercase so it passes if condition
			c = Character.toLowerCase(c);
			if(c == 'a' || c == 'e' ||
			   c == 'i' || c == 'o' ||
			   c == 'u' || c == 'y') {
			
				vowelPosition.add(i);
			}
		}
		
		//returns arraylist filled values of the positions of all vowels
		return vowelPosition.toString();
	}
}

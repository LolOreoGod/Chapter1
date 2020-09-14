package me.mc.ChapterOne;


public class ChapterOneExercises {
	

	
	public static void main(String[] args) {
		// Exercises 1.1 - printing a greeting
		System.out.println("Bonjour!");
		
		//
		
		//Exercise 1.2 - printing sum of numbers 1 through 10
		int sum = 0, limit = 10;
		for (int i = 1; i<= limit; i++) {
			//for an integer, i, as long as i is less or equal to limit value, add 1 to i
			//loop exits when i reaches 11
			
			sum += i;
		}
		System.out.println("The sum of numbers 1 through " + limit + ", is " + sum);

		//
		
		//Exercises 1.7 - printing my name in morse code
		
		System.out.println("-");
		System.out.println(".");
		System.out.println("-.");
		System.out.println("--.");
		System.out.println("-");
		System.out.println("..");
		System.out.println("-.");
		System.out.println("--.");

		//

	}
}

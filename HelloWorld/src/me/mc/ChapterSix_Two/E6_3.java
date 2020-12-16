package me.mc.ChapterSix_Two;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/14/20
 * 
 * Contents: Chapter 6 Project, E6.3
 * 
 * Function: Read a sequence of integer inputs and print the smallest/largest of the inputs, number of even/odd inputs, cumulative totals, adjacent duplicates
 * Methods:
 * 	getSmallest: returns smallest integer from list
 * 	getLargest: returns largest integer from list
 * 	countEvens: returns total number of even integers from list
 * 	countOdds: returns total number of odd integers from list
 * 	getTotals: returns cumulative total of the list
 * 	getAdjacentDuplicates: returns adjacent duplicates
 * 
 * 
 *************************************************/



public class E6_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		  // Create a list to put the input numbers in
        List<Integer> ints = new ArrayList<>();

        // Ask the user for input
        System.out.println("Enter integers, enter a blank line to stop the input:");
        while(true) {
            // Gather the user input
            String valStr = in.nextLine();

            // Check whether the line is empty, to stop asking for user input
            if(valStr.trim().length() == 0) {
                break;
            }

            // Try to parse the value, and add it to the list
            try {
                ints.add(Integer.valueOf(valStr));
            } catch(Exception ex) {
                System.out.println("You've entered an illegal integer! ");
                System.out.println("Enter a new integer, or a blank line to stop the input.");
            }

        }
        
        // Print the smallest and largest values
        System.out.println("Smallest: " + getSmallest(ints));
        System.out.println("Largest: " + getLargest(ints));

        // Print the number of even and odd numbers
        System.out.println("Even numbers: " + countEvens(ints));
        System.out.println("Odd numbers: " + countOdds(ints));

        // Print the cumulative and adjacent integers
        System.out.print("Cumulative totals: ");
        getTotals(ints);
        System.out.println("Adjacent duplicates: ");
        getAdjacentDuplicates(ints);
        
   
	}
	
	/*
	 * Returns smallest integer from the list
	 */
	public static int getSmallest(List<Integer> ints) {
		int smallest = ints.get(0);
		
		for(Integer i : ints) {
			if(smallest > i) {
				smallest = i;
			}
		}
		return smallest;
		
        }
	
	
	/*
	 * Returns largest integer from the list
	 */
	public static int getLargest(List<Integer> ints) {
		int largest = ints.get(0);
		
		for(int i : ints) {
			if(largest < i) {
				largest = i;
			}
		}
		
		return largest;
		
	}
	
	
	/*
	 * Returns amount of even numbers from the list
	 */
	public static int countEvens(List<Integer> ints) {
		int c = 0;
		
		for(int i : ints) {
			if(i % 2 == 0) {
				c++;
			}
		}
		
		return c;	
	}
	
	/*
	 * Returns amount of odd numbers from the list
	 */
	public static int countOdds(List<Integer> ints) {
		int c = 0;
		
		for(int i : ints) {
			if(!(i % 2 == 0)) {
				c++;
			}
		}
		
		return c;	
	}
		
	
	/*
	 * Returns cumulative totals from the list
	 */
	public static void getTotals(List<Integer> ints) {
		int temp = 0;
		/*
		 * if list is 
		 * a, b, c ,d
		 * 
		 * the new list would be
		 * a = a, b = a+b, c = b+c, d =c+d  
		 * 
		 */
		for(int i : ints) {
			System.out.print((temp += i) + " ");
		}
		
		System.out.println();
		
	}
	
	/*
	 * Returns adjacent duplicates from the list
	 */
	public static void getAdjacentDuplicates(List<Integer> ints) {
		int temp = ints.get(0);
		boolean printed = false;
		
		/*
		 * Iterates through the list. Compares one value to the next. 
		 */
		for(int i = 1; i < ints.size(); i++) {
			int val = ints.get(i);
			/*
			 * If both values are equal,
			 */
			if(val == temp) {
				/*
				 * If it has not been printed, print the value
				 */
				if(!printed) {
					System.out.println(val);
					printed = true;
				}
			}
			/*
			 * If not, move forward, reset boolean
			 */
			else {
				temp = val;
				printed = false;
			}
		}
		
		
		System.out.println();
	}
	
}
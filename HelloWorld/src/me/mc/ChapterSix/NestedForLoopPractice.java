package me.mc.ChapterSix;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/02/20
 * 
 * Contents: Chapter 6 homework, Nested for loops
 * 
 * Function: Reads a word. Prints the number of vowels in the word
 * 
 * 
 *************************************************/


public class NestedForLoopPractice {
	
	public static void main(String[] args) {
		
	System.out.println("==========Problem 4===========");
	/*
	 * Write a for loop to print the following output:
	 * 
	 * 		*****
	 * 		*****
	 * 		*****
	 * 		*****
	 * 
	 */
	
		final int col1 = 5;
		final int row1 = 4;
		
		for(int i = 0; i < row1; i++) {
			
			for(int j = 0; j < col1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	System.out.println("==========Problem 5===========");
	/*
	 * Write a for loop to print the following output:
	 * 
	 * 
	 *      *
	 *      **
	 *      ***
	 *      ****
	 *      *****
	 * 
	 */
		
		final int row2 = 5;
		for (int i = 0; i < row2; i++) {
			
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
	System.out.println("==========Problem 6===========");
	/*
	 * Write a for loop to print the following output:
	 * 
	 * 
	 * 		1
	 * 		22
	 * 		333
	 * 		4444
	 * 		55555
	 * 		666666
	 * 		7777777
	 * 
	 */
	
	final int row3 = 7;
	int x1 = 1;
	for(int i = 0; i < row3; i++) {
		
		for(int j = 0; j <= i; j++) {
			//repeats the same number for j times
				System.out.print(x1);
		}
		
		//increases number outputted by 1
		x1++;
		System.out.println();
		
	}
	
	
	System.out.println("==========Problem 7===========");
	/*
	 * Write a for loop to print the following output:
	 * 
	 * 
	 * 		____1
	 * 		___2
	 * 		__3
	 * 		_4
	 * 		5
	 * 
	 */
	final int row4 = 5;
    int k = row4 - 1;
    int x2 = 1;
    for(int i=0; i < row4; i++)
    {
        for(int j = 0; j < k; j++)
        {
        	//Prints number of spaces till max k
            System.out.print(" ");
        }
        //Decreases number of max spaces
        k--;
        //prints number
        System.out.print(x2);
        //increases number printed
        x2++;
        System.out.println();
    }

	
	
	System.out.println("==========Problem 8===========");	
	/*
	 * Write a for loop to print the following output:
	 * 
	 * 
	 * 		____1
	 * 		___22
	 * 		__333
	 * 		_4444
	 * 		55555
	 * 
	 * 
	 */
	
	final int row5 = 5;
    int k2 = row5 - 1;
    int x3 = 1;
    for(int i=0; i < row5; i++)
    {
        for(int j = 0; j < k2; j++)
        {
        	//prints spaces till max k2
            System.out.print(" ");
        }
        //decreases max spaces
        k2--;
        
        
        for(int j=0; j<=i; j++)
        {
        	//prints numbers j times until j = i < row5
            System.out.print(x3);
        }
        
        //increases number printed
        x3++;
        System.out.println();
    }
		
	}
}

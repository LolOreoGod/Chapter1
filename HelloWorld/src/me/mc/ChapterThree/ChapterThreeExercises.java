package me.mc.ChapterThree;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 9/27/20
 * 
 * Contents: Chapter 3 homework, R3.1, R3.3, E3.1
 * 
 *************************************************/


/* R3.1: "What is the public interface of the Counter class in Section 3.1? How does it differ from the implementation of the class?"
 * 
 * 		The public interface of the Counter class consists of the getValue and click method. It differs from the implementation of the
 *		class in that it merely defines the functionalities supported by the class while the implementation of the class is how the code
 *		that accomplishes the tasks supports the class's functionality.
 */


/* R3.3: "Instance variables are a part of the hidden implementation of a class, but they aren't actually hidden from programmers who have the source code of the class.
 *        Explain to what extent the private reserved word provides information hiding."
 *        
 *		The private reserved word forces the programmer to use the public interface to access and modify the variable. The instance variable
 *		is hidden from methods outside of the class.
 */



public class ChapterThreeExercises {
	/* E3.1: "We want to add a button to the tally counter in section 3.1 that allows an operator to undo an accidental click.
	 * 		  Make sure that clicking the undo button more often than the click button has no effect."
	 * 
	 */
	
	
	private int value;
	
	
	public int getValue() {
		return value;
	}
	
	public void click() {
		value = value + 1;
	}
	
	
	public void undo() { //my code
		if (value >= 0) {
			value = value - 1;
		}
	}
	
	
	

}

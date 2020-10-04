package me.mc.ChapterThree_Two;



/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/4/20
 * 
 * Contents: Chapter 3-2 homework, E3.15
 * 
 * Function: A moving bug
 * 
 *************************************************/

public class Bug {
private int initialPosition;
private int currentPosition;

//the bug first travels right. so  by default, boolean right = true
private boolean right = true;
	

//A method constructor to set the bug's initial position
	public Bug(int initialPosition) {
		this.initialPosition = initialPosition;
		//the bug's current location when the program runs is the initial position
		currentPosition = this.initialPosition;
	}

	
//A method to change the direction the bug is travelling. Either right or left. It first travels right
	public void turn() {
		if (right) {
			//if it is already travelling right, when turn() is called, it travels left
			right = false;
		}
		
	}
	
//A method to move the bug along a line.
	public void move() {
		if (right) {
			//when travelling right, the current position is being added by 1
		currentPosition++;
		}
		if(!right) {
			//when travelling left, the current position is being subtracted by 1
			currentPosition--;
		}
		
	}

//A method to return the bug's position.
	
	public int getPosition() {
		
		return currentPosition;
	}

	
}


class BugTester {
	public static void main(String[] args) {
		Bug bug = new Bug(0);
		bug.move();
		bug.turn();
		bug.move();
		bug.move();
		//expected: -1 
		System.out.println("The expected answer is -1");
		System.out.println("The answer the program got is: " + bug.getPosition());
	}
}
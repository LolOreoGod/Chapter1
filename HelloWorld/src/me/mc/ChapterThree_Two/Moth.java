package me.mc.ChapterThree_Two;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/4/20
 * 
 * Contents: Chapter 3-2 homework, E3.16
 * 
 * Function: A moth flying along a straight line
 * 
 *************************************************/

public class Moth {
	
private double initialPosition;
private double currentPosition;
private double lightPosition;

//A method constructor to set the Moth's initial position
	public Moth(double initialPosition) {
		this.initialPosition = initialPosition;
		this.currentPosition = this.initialPosition;
		
	}
	
	
//a method constructor that moves the moth towards the light. 
//the new position should be the midpoint from the moth's starting position and the location of the light.
	public void moveToLight(double lightPosition) {
		this.lightPosition = lightPosition;
		this.currentPosition = (this.currentPosition + this.lightPosition) / 2;
		
	}
	
	
//A method that returns the moth's current position
	public double getPosition() {
		return currentPosition;
	}

}

class MothTester {
	public static void main(String[] args) {
		Moth moth = new Moth(0);
		moth.moveToLight(10);
		moth.moveToLight(-10);
		moth.moveToLight(3);
		System.out.println("Expected answer: 0.25");
		System.out.println("The answer the program got: " + moth.getPosition());
	}
}

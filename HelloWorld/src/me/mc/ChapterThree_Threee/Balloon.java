package me.mc.ChapterThree_Threee;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/13/20
 * 
 * Contents: Chapter 3-3 Homework, Assignment P3.3
 * 
 * Function: Change all instance variables
 * 
 * Constructors:
 * 	Ballon: constructs a balloon with the following methods
 * 
 * Methods:
 *  inflate: Adds amount (double) to the radius
 * 	getRadius: Returns radius 
 *  getVolume: Returns volume of balloon
 *************************************************/
public class Balloon {
	private double radius = 0;
	
	//Default Constructor
	public Balloon() {

	}

	//Adds amount (double) to the radius
	public void inflate(double amount) {
		this.radius += amount;
	}
	
	
	//Returns radius of balloon
	public double getRadius() {
		return radius;
	}
	
	//Returns volume of sphere
	public double getVolume() {
		final double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;
		return volume;
	}
}


//driver class
class BalloonTester {
	public static void main(String[] args) {
		Balloon balloon = new Balloon();
		balloon.inflate(5.0);
		System.out.println("Radius = " + balloon.getRadius());
		System.out.println(balloon.getVolume());
		System.out.println("Expected answer: 523.6");
	}
}



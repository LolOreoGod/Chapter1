package me.mc.ChapterSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/02/20
 * 
 * Contents: Chapter 6 homework, E6.6
 * 
 * Function: Constructs a set of doubles, returns average, max, min, and range
 * 
 * Methods:
 * 	add: adds a value to the set
 * 	getAverage: Scans all list values and adds them together. returns the average 
 * 	getLargest: Returns largest value in the set
 * 	getSmallest: Returns smallest value in the set
 * 	getRange: Returns max - min in the set
 * 
 * 
 *************************************************/
public class DataSet {

	private double average;
	private double smallest;
	private double largest;
	private double range;
	//Creates a list with type double
	List<Double> set = new ArrayList<>();
	
	//Default constructor
	public DataSet() {
		
	}
	
	public DataSet(double value) {
		//Add to list
		set.add(value);
	}
	
	
	public void add(double value) {
		//Add to list
		set.add(value);
	}
	
	public double getAverage() {
		double first = 0;
		//Iterates through all list values and adds them together
		for(int i = 0; i < set.size() - 1; i++){
			
			first = set.get(i);
			i++;
			first = first + set.get(i);
			
		}
		//Calculates average and returns it
		this.average = first / set.size();
		return average;
	}
	
	
	public double getSmallest() {
		//Returns smallest
		this.smallest = Collections.min(set);
		return this.smallest;
	}

	
	
	
	public double getLargest() {
		//Returns largest
		this.largest = Collections.max(set);
		return this.largest;
	}
	
	public double getRange() {
		//Calculates range and returns it
		this.range = this.largest - this.smallest;
		return range;
	}
	
}



//Tester
class DataSetTester {
	
	public static void main(String[] args) {
		DataSet mySet = new DataSet(20);
		mySet.add(40);
		mySet.add(25);
		mySet.add(1);
		System.out.println("Average: " + mySet.getAverage());
		System.out.println("Smallest: " + mySet.getSmallest());
		System.out.println("Largest: " + mySet.getLargest());
		System.out.println("Range: " + mySet.getRange());
		
		
	}
	
}
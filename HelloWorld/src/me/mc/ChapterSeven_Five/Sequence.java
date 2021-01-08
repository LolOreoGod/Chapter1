package me.mc.ChapterSeven_Five;

import java.util.ArrayList;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 1/7/21
 * 
 * Contents: Chapter 7 Hw 5, E7.22
 * 
 * Function: Adds a method append, appends list b to a without modifying a or b
 * Methods:
 * 	add: Adds an integer to arraylist
 * 	toString: Converts arraylist to stirng
 * 	length: returns length of arraylist
 * 	get: get element within arraylist
 * 	append: adds all elements of one arraylist to another
 *
 *
 *************************************************/
public class Sequence {

	private ArrayList<Integer> values;
	
	//Constructor for sequence object
	public Sequence() {
		values = new ArrayList<Integer>();
	}
	
	//Adds an integer to the sequence
	public void add(int n) {
		values.add(n);
	}
	
	
	//Converts arraylist to string
	public String toString() {
		return values.toString();
	}
	
	//Length of arraylist
	public int length() {
		return values.size();
	}
	
	
	//Gets element at specific place
	public int get(int element) {
		return values.get(element);
	}
	
	
	//Appends sequence b to sequence a without modifying either
	public Sequence append(Sequence other) {
		Sequence combinedList = new Sequence();
		
		for(int i = 0; i < values.size(); i++) {
			combinedList.add(values.get(i));
		}

		for(int i = 0; i < other.length(); i++) {
			combinedList.add(other.get(i));
		}
		
		return combinedList;
	}
	

}


class SequenceTester{
	
	public static void main(String[] args) {
		
		Sequence mySequence = new Sequence();
		
		mySequence.add(5);
		mySequence.add(3);
		
		
		Sequence mySeq2 = new Sequence();
		mySeq2.add(3);
		mySeq2.add(4);
		
		//Expected: 5, 3, 3, 4
		System.out.println(mySequence.append(mySeq2));
		

	}
	
}

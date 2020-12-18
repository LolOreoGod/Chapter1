package ChapterSeven_Two;

import java.util.Arrays;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/17/20
 * 
 * Contents: Chapter 7 Hw3, E7.9
 * 
 * Function: Stores a number of values of type double. Calculates sum, average, maximum, and minimum value
 * Methods:
 * 	add: Adds a value to the array as long as it does not exceed array size
 * 	getSum: Computes and returns sum of all elements in array
 * 	getAvg: Computes and returns avg of all elements in array
 * 	getMax: Compares all values and returns the largest element in array
 * 	getMin: Compares all values and returns the smallest element in array
 * 
 * 
 *************************************************/


public class DataSet {
	private int values = 0;
	private int totalElements;
    double[] mySet;
	public DataSet(int maximumNumberOfValues) {
		mySet = new double[maximumNumberOfValues];
		totalElements = maximumNumberOfValues - 1;
		
	}
	
	/*
	 * Adds a value to the double array
	 */
	public void add(double value) {
		//as long as the added value does not exceed the max number of values, add it to the array
		if(values > totalElements) {

		}
		else {
			mySet[values] = value;
			values++;

		}
		
		
		
	}
	
	/*
	 * @returns sum of all numbers in array as a double
	 */
	public double getSum() {
		double sum = 0;
		for(int i = 0; i < mySet.length; i++) {
			sum += mySet[i];
		}
		
		return sum;
	}
	
	/*
	 * @returns average of all numbers in array as a double
	 */
	public double getAverage() {
		
		double sum = 0;
		for(int i = 0; i < mySet.length; i++) {
			sum += mySet[i];
		}
		
		double avg = sum / mySet.length;
		return avg;
	}
	
	
	/*
	 * Sorts the array. @returns last array (max)
	 */
	public double getMax() {
		Arrays.sort(mySet);
		double max = mySet[totalElements];

		return max;
	}
	
	
	/*
	 * Sorts the array @returns first array [0]
	 */
	public double getMin() {
		Arrays.sort(mySet);
		double min = mySet[0];
		
		return min;
	}
}


/*
 * Driver class
 */
class DataSetTester {
	
	public static void main(String[] args) {
		
		//creates data set with space for 4 elements
		DataSet myData = new DataSet(4);
		myData.add(10.3);
		myData.add(53.3);
		myData.add(1);
		myData.add(3);
		//The below values are not added to the list
		myData.add(5);
		myData.add(1);
		
		//Testing
		System.out.println("Maximum: " + myData.getMax());
		System.out.println("Minimum: " + myData.getMin());
		System.out.println("Average: " + myData.getAverage());
		System.out.println("Sum of all values: " + myData.getSum());
	}
	
}

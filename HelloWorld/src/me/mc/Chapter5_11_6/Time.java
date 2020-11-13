package me.mc.Chapter5_11_6;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/13/20
 * 
 * Contents: Chapter 5 Classwork, E5.14
 * 
 * Function: Prompts user for two times. Prints the time that comes first, then the other time
 * 
 * Methods:
 * 
 * compareTo: 
 *
 * 
 *************************************************/
public class Time {
 /*
  * Class variables
  */
	private int hour;
	private int minute;

	/*
	 * Constructor
	 * @param hour hour
	 * @param minute minute
	 */
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		
	}
	
	
	/*
	 * @return int
	 * returns -1 if Time comes before the other
	 * returns 0 if both times are equal
	 * returns 1 if Time comes after the other
	 */
	public int compareTo(Time other) {
		
		if(hour < other.hour) {
			return -1;
		}
		else if(hour == other.hour) {
			if(minute < other.minute) {
				return -1;
			}
			if(minute == other.minute) {
				return 0;
			}
			else {
				return 1;
			}
			
		}
		else {
			return 1;
		}
		
		
		
	}
	
	
	
	
}


/*
 * Driver class
 */
class TimeTester {
	public static void main(String[] args) {
		Time myTime = new Time(12, 30);
		Time myTime2 = new Time(12, 32);
		System.out.println(myTime.compareTo(myTime2));
		/*
		 * Expected: -1
		 */
	}
}

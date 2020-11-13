package me.mc.Chapter5_11_6;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 5 Classwork, E5.15
 * 
 * Function: Uses the given algorithm to yield the season, given the month and day
 * 
 * Methods:
 * 
 * getSeason: Returns the season
 *
 * 
 *************************************************/
public class Date {
	private String season;
	@SuppressWarnings("unused")
	private int month;
	@SuppressWarnings("unused")
	private int day;
	
	public Date(int month, int day) {
		this.month = month;
		this.day = day;
		
		/*
		 * ALGORITHM to determine what season it is
		 */
		if(month == 1 || month == 2 || month == 3) {
			season = "Winter";
		}
		else if(month == 4 || month == 5 || month == 6) {
			season = "Spring";
		}
		else if(month == 7 || month == 8 || month == 9) {
			season = "Summer";
		}
		else if(month == 10 || month == 11 || month == 12) {
			season = "Fall";
		}
		
		
		if ((month % 3) == 0 && day >= 21) {
			if (season.contentEquals("Winter")) {
				season = "Spring";
			}
			else if(season.contentEquals("Spring")) {
				season = "Summer";
			}
			else if(season.contentEquals("Summer")) {
				season = "Fall";
			}
			else {
				season = "Winter";
			}
		}
	}
	
	/*
	 * @return season
	 */
	public String getSeason() {
		
		return season;
	}
	
	

}

/*
 * Driver class
 */
class DateTester {
	public static void main(String[] args) {
		Date now = new Date(3, 22);
		System.out.println(now.getSeason());
		
	}
}
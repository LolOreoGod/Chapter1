package me.mc.ChapterFour;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, P4.3
 * 
 * Function: Takes three coordinates (x,y), and calculates the length of all sides, angles at all corners, the perimeter, and the area
 * 
 * Methods:
 * 
 * getLengths: Uses distance formula to calculate all three lengths. returns lengths
 * getPerimeter: Adds all 3 lengths together, returns perimeter
 * getArea: Uses an area formular to calculate area. returns area
 * getAngles: Uses law of cosines to calculate all three angles. returns angles
 *
 * 
 *************************************************/

public class Triangle {
	
	/*
	 * Class variables
	 */
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	
	private double lengthA;
	private double lengthB;
	private double lengthC;
	private String length;
	
	private double perimeter;
	private double area;
	
	
	private double angleA;
	private double angleB;
	private double angleC;
	private String angles;

	
	
	
	/*
	 * Constructor: Triangle with 3 sets of x and y coordinates
	 */
	public Triangle(int x1, double y1, double x2, double y2, double x3, double y3) {
		
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		
		//Calculating length of all sides
		lengthA = Math.abs(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
		lengthB = Math.sqrt((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)));
		lengthC = Math.sqrt((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)));
		
		
		//Calculating angles using law of cosines
		
		double cosA = (Math.pow(lengthB, 2) + Math.pow(lengthC, 2) - Math.pow(lengthA, 2)) / (2 * lengthB * lengthC);
		double cosB = (Math.pow(lengthA, 2)+ Math.pow(lengthC, 2) - Math.pow(lengthB, 2)) / (2 * lengthA * lengthC);
		double cosC = (Math.pow(lengthA, 2) + Math.pow(lengthB, 2) - Math.pow(lengthC, 2)) / (2 * lengthB * lengthA);
		
		//Finding cosine inverse, then converting it to degrees
		angleA = Math.acos(cosA);
		angleA = Math.toDegrees(angleA);
		angleB = Math.acos(cosB);
		angleB = Math.toDegrees(angleB);
		angleC = Math.acos(cosC);
		angleC = Math.toDegrees(angleC);
		
		
		//Check to see if angle is negative, so it is translated into a positive angle
		if (angleA < 0) {
			angleA = 2 * Math.PI - angleA;
		}
		if (angleB < 0) {
			angleB = 2 * Math.PI - angleB;
			
		}
		if (angleC < 0) {
			angleC = 2 * Math.PI - angleC;
		}
		
	}
	
	
	
	/*
	 * Returns length of all sides of the triangle
	 */
	public String getLengths() {
		
		length = lengthA + " " + lengthB + " " + lengthC;
		
		return length;
	}
	
	
	
	/*
	 * Returns perimeter of the triangle
	 */
	public double getPerimeter() {
		
		perimeter = lengthA + lengthB + lengthC;
		return perimeter;
	}
	
	/*
	 * Returns area of the triangle
	 */
	public double getArea() {
		
		area = 0.5 * Math.abs((x1 * (y2-y3)) + (x2 * (y3-y1)) + (x3 *(y1-y2)));
		
		return area;
		
	}
	
	/*
	 * Returns all angles of the triangle
	 */
	public String getAngles() {
		
		angles = angleA + " " + angleB + " " + angleC;
		
		return angles;
	}
	
	
}



/*
 * Driver class
 */
class TriangleTester {
	
	public static void main(String[] args) {
		//Creates a triangle with coordinates (1,4) (4,7) (6,8)
		Triangle myTriangle = new Triangle(1, 4, 4, 7, 6, 8);
		
		System.out.printf("%s", "Lengths: ");
		System.out.printf("%60s", myTriangle.getLengths());
		System.out.printf("\n%s", "Perimeter: ");
		System.out.printf("%23s", myTriangle.getPerimeter());
		System.out.printf("\n%s", "Area: ");
		System.out.printf("%13s", myTriangle.getArea());
		System.out.printf("\n%s", "Angles: ");
		System.out.printf("%63s", myTriangle.getAngles());
		
		
		System.out.println("\n\nExpected output:");
		System.out.printf("%s", "Lengths: ");
		System.out.printf("%15s", "4.24 2.24 6.4");
		System.out.printf("\n%s", "Perimeter: ");
		System.out.printf("%3s", "12.88");
		System.out.printf("\n%s", "Area: ");
		System.out.printf("%8s", "1.5");
		System.out.printf("\n%s", "Angles: ");
		System.out.printf("%20s", "12.09 6.34 161.57");
			
		}
	
}

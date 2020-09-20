package me.mc.ChapterTwo;

import java.awt.Rectangle;

public class RectangleObjectE2_1andE2_2 {
		// E2.1 Write an AreaTester program that constructs a Rectangle object and then computes and prints its area. Use the getWidth and getHeight methods
		//Also print expected answer
	public static void main(String[] args) {
		Rectangle box = new Rectangle(0, 0, 10, 20);
		
		int w = (int) box.getWidth();
		int h = (int) box.getHeight();
		System.out.println("The area of the rectangle is: " + w * h);
		System.out.println("The expected answer is 200");
		
		
		//E2.2 Write a PerimeterTester program that constructs a rectangle object and then computes and print its Perimeter. Use the get Width and getHeight methods
		//Also print expected answer
		int p = 2 * (w+h);
		System.out.println("The perimeter of the rectangle is: " + p);
		System.out.println("The expected perimeter of the rectangle is: 60");
		
	
	}
	
}

package me.mc.ChapterTwo;

import java.awt.Point;
import java.awt.Rectangle;


public class FourRectanglePrinterP2_1{
	
	/*
	P2.1 Write a program called FourRectanglePrinter that constructs a Rectangle object, prints its location by calling System.out.println(box), and then
	translates and prints it three more times, so that, if the rectangles were drawn, they would form one large rectangle, as shown at right.
	Your program will not produce a drawing. It will simply print the locations of the four rectangles. 
	*/
	
		//CREATING BOX 1 at 0,0 with a width of 10 and a height of 20
		static Rectangle box = new Rectangle(0,0,10,20);
		static int w = (int) box.getWidth();
		static int h = (int) box.getHeight();
		static Point loc1 = box.getLocation();
		//PRINTS ONLY THE COORDS, INSTEAD OF JAVA.AWT.POINT(0,0)
		static String locString1 = "[" + loc1.x + "," + loc1.y + "]";
		
		//CREATING BOX 2 at 10,0 with a width of 10 and a height of 20
		static Rectangle boxRight = new Rectangle(w, 0, 10, 20);
		static Point loc2 = boxRight.getLocation();
		static String locString2 = "[" + loc2.x + "," + loc2.y + "]";
		
		//CREATING BOX 3 at 0,20 with a width of 10 and a height of 20
		static Rectangle boxDown = new Rectangle(0, h, 10, 20);
		static Point loc3 = boxDown.getLocation();
		static String locString3 = "[" + loc3.x + "," + loc3.y + "]";
		
		//CREATING BOX 4 at 10,20 with a width of 10 and a height of 20
		static Rectangle boxDownRight = new Rectangle(w, h, 10, 20);
		static Point loc4 = boxDownRight.getLocation();
		static String locString4 = "[" + loc4.x + "," + loc4.y + "]";
	
	public static void main(String[] args) {
		System.out.println("The location of box one is " + locString1);
		System.out.println("The location of box two is " + locString2);
		System.out.println("The location of box three is " + locString3);
		System.out.println("The location of box four is " + locString4);
	}
	
	
}

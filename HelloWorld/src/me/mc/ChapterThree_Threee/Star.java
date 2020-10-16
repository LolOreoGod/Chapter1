package me.mc.ChapterThree_Threee;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/15/20
 * 
 * Contents: Chapter 3-3 Homework, Assignment P3.6
 * 
 * Function: Draw 3 stars
 * 
 * Constructors:
 * 	Star: constructs a star object with x and y coordinates.
 * 
 * Methods:
 *  draw: draws a star and translates it by the x and y coordinates of the star object
 * 	paintComponent: paints the stars using the methods
 *************************************************/

public class Star{
	private int originx;
	private int originy;
	
	public Star(int x, int y) {
		this.originx = x;
		this.originy = y;
		
	}
	
	public void draw(Graphics2D g2) {
		
	
		
		//y = -x
		Line2D.Double segment = new Line2D.Double(200, 100, 100, 200);
		g2.translate(originx, originy);
		g2.draw(segment);
		
		
		//y = x
		Line2D.Double segment1 = new Line2D.Double(200, 200, 100, 100);
		g2.draw(segment1);
		
		
		//y = x
		Line2D.Double segment2 = new Line2D.Double(150, 200, 150, 100);
		g2.draw(segment2);

		
		//y = y
		Line2D.Double segment3 = new Line2D.Double(100, 150, 200, 150);
		g2.draw(segment3);
		
	}

}

@SuppressWarnings("serial")

class StarComponent extends JComponent{
	
	
	
	//Draws the stars using the methods
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
	
		
		
		//Instance 1 of Star object
		Star one = new Star(0, 0);
		one.draw(g2);
		
		
		//Instance 2 of Star object
		Star two = new Star(220, 0);
		two.draw(g2);
		
		//Instance 3 of Star Object
		Star three = new Star(150, 200);
		three.draw(g2);
		
		
	}
}


//driver class
class StarViewer {
	public static void main(String[] args) {
		
		
		//Setting the window
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(5000, 5000);
		frame.setVisible(true);
		StarComponent component = new StarComponent();
		frame.add(component);

		
	}
}

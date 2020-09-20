package me.mc.ChapterTwo;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//P2.11 REPEAT EXERCISE P2.10 BUT NOW WRITE A GRAPHICAL APPLICATION THAT SHOWS THE LINE AND THE POINTS
// DRAW EACH POINT AS A TINY CIRCLE. USE THE DRAWSTRING METHOD TO DRAW EACH DISTANCE NEXT TO THE POINT, USING CALLS
public class LineDistanceTesterP2_11 extends JComponent{

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
	
		//Making the line
		Line2D.Double segment = new Line2D.Double(100, 100, 200, 200);
		g2.draw(segment);
		
		//Making point 1
		Ellipse2D.Double p = new Ellipse2D.Double(100, 200, 5, 5);
		g2.draw(p);
		
		//Making point 2
		Ellipse2D.Double p1 = new Ellipse2D.Double(150, 150, 5, 5);
		g2.draw(p1);
		
		//Making point 3
		Ellipse2D.Double p2 = new Ellipse2D.Double(250, 50, 5, 5);
		g2.draw(p2);
		
		//Distance from line to point 1
		Double distance = segment.ptSegDist(p.getX(), p.getY());
		g2.drawString("Distance: " + distance, (int) p.getX(), (int) p.getY());
		
		//Distance from line to point 2
		Double distance1 = segment.ptSegDist(p1.getX(), p1.getY());
		g2.drawString("Distance: " + distance1, (int) p1.getX(), (int) p1.getY());
				
				
		//Distance from line to point 3
		Double distance2 = segment.ptSegDist(p2.getX(), p2.getY());
		g2.drawString("Distance: " + distance2, (int) p2.getX(), (int) p2.getY());
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		//Setting the window
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		LineDistanceTesterP2_11 component = new LineDistanceTesterP2_11();
		frame.add(component);
	}
}

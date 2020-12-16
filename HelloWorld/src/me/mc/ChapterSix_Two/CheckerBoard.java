package me.mc.ChapterSix_Two;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 12/16/20
 * 
 * Contents: Chapter 6 projects, P6.19
 * 
 * Function: A program that displays a checkerboard with 64 squares, alternating white and black
 * 
 * 
 *************************************************/

@SuppressWarnings("serial")
public class CheckerBoard extends JComponent{

	   public void paint(Graphics g){
		  Graphics2D g2 = (Graphics2D) g;
		  //length of square
		  final int length = 50;
		  //Fills rows and columns with black and white
	      for (int row = 0;  row < 8;  row++ ) {
	         for (int col = 0;  col < 8;  col++) {
	        	 
	        	//Coordinates for squares
	            int x = col * length;
	            int y = row * length;
	            
	            //if row and column are both odd or even, it is white
	            if ( (row % 2) == (col % 2) ) {
	               g2.setColor(Color.WHITE);
	            }
	            
	            //if row and column are not both odd or even, it is black
	            else {
	               g2.setColor(Color.BLACK);
	            }

	            //fill the rectangle
	            g2.fillRect(x, y, length, length);
	         }
	      }
	   }

	   
	   //Setting the window
	   public static void main(String[] args) {
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500, 500);
			frame.setVisible(true);
			CheckerBoard component = new CheckerBoard();
			frame.add(component);
	    }
}


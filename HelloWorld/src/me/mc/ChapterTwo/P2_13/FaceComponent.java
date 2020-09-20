package me.mc.ChapterTwo.P2_13;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class FaceComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		
		//Making the head
		Ellipse2D.Double head = new Ellipse2D.Double(150, 150, 100, 100);
		g2.draw(head);
		
		//Making the eyes
		Ellipse2D.Double leftEye = new Ellipse2D.Double(170, 175, 10, 10);
		g2.draw(leftEye);
		
		Ellipse2D.Double rightEye = new Ellipse2D.Double(220, 175, 10, 10);
		g2.draw(rightEye);
		
		
		//Making the mouth

		Line2D.Double mouth = new Line2D.Double(170, 220, 230, 220);
		g2.draw(mouth);
		
	}

}

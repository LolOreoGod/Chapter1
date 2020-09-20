package me.mc.ChapterTwo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TranslateDemoP2_5 extends JComponent{
	//P2.5. Visually show the translate method of the Rectangle class
	static Rectangle box = new Rectangle(0, 0, 100, 200);
	
	
	
	//draws the box and the translation
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(box);
		box.translate(100, 0);
		g2.draw(box);
	}
	
	
	public static void main(String[] args) {
		//the actual frame 
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		TranslateDemoP2_5 component = new TranslateDemoP2_5();
		frame.add(component);
	

		
		
	}

}

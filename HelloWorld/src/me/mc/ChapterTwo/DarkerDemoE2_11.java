package me.mc.ChapterTwo;

import java.awt.Color;

import javax.swing.JFrame;

public class DarkerDemoE2_11 {
	//E2.11 Repeat exercise 2.9, but apply the darker method of the color class twice to the object color.red. Call your class darkerdemo. 
	
	public static void main(String[] args) {
		//Exercise 2.9
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		Color myColor = new Color(50, 100, 150);
		myColor.brighter();
		System.out.println(myColor);
		
		//Exercise 2.11
		Color myColor1 = Color.RED.darker().darker();
		frame.getContentPane().setBackground(myColor1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

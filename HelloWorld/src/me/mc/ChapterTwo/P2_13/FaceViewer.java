package me.mc.ChapterTwo.P2_13;

import javax.swing.JFrame;

public class FaceViewer {
	//P2.13 WRITE A PROGRAM TO PLOT THE FACE AT RIGHT. PROVIDE A CLASS FACEVIEWEER AND A CLASS FACECOMPONENT
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("A Face");
		frame.setVisible(true);
		
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
	}
}

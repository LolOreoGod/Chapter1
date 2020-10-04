package me.mc.ChapterThree_Two;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/4/20
 * 
 * Contents: Chapter 3-2 homework, E3.14
 * 
 * Function: Class for authoring a simple letter
 * 
 *************************************************/





public class Letter {
//Declares global class variables
private String author;
private String recipient;
private String body;


//Constructs method Letter that takes inputs: author and recipient
	public Letter(String from, String to) {
		this.author = from;
		this.recipient = to;
		this.body = "";
		
	}
	
//A method that adds a line to the letter
	public void addLine(String line) {
		this.body = body + line + "\n";
		
	}
	
//A method that returns the entire letter
	public String getText() {
		String text = "Dear " + recipient + ":\n\n";
		text += body + "\nSincerely, \n\n" + author + ".";
		
		
		return text;
		
	}
	
	
	
	
}

class LetterPrinter{
	
	//Utilizes the methods in the Letter class to create the specified letter
	public static void main(String[] args) {
		Letter letter = new Letter("Mary", "John");
		letter.addLine("I am sorry we must part.");
		letter.addLine("I wish you all the best.");
		System.out.println(letter.getText());
			
	}
}

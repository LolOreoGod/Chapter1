package me.mc.ChapterTwo;

public class ReplaceTesterE2_6 {
	//E2.6 Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!" and all letters "s" with "$". Use the replace method. Demonstrate that
	// you can correctly encode the string "Mississippi". Print both the actual and expected results. 
	
	public static void main(String[] args) {
		String str = new String("Mississippi");
		String replaceI = str.replace("i", "!");
		String replaceS = replaceI.replace("s", "$");
		System.out.println(replaceS);
		System.out.println("Expected result: M!$$!$$!pp!");
	}
	

}

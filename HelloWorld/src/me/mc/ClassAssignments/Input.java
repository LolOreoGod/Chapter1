package me.mc.ClassAssignments;
import java.util.Scanner;

public class Input {

	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a name: ");
		String name = in.nextLine();
		
		System.out.print("Please enter your age: ");
		int age = in.nextInt();
		
		System.out.print("Please enter your height: ");
		double height = in.nextDouble();
		
		
		
		System.out.println("Student Name: " + name);
		System.out.println("Student Height: " + height + " inches");
		System.out.println("Student Age: " + age + " years old");
	}
}

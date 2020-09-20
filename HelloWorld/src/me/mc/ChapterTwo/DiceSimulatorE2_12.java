package me.mc.ChapterTwo;

import java.util.Random;

public class DiceSimulatorE2_12 {
	public static void main(String[] args) {
		//E2.12 The random class implements a random number generator, which produces sequences of numbers that appear to be random. Construct an object of the random class,
		// and then apply the nextInt method. For ex, the call generator.nextInt(6) gives you a random number between 0 and 5. 
		//Write a program DieSimulator that uses the random class to simulate the cast of a die 1-6. 
		Random gen = new Random();
		int roll = gen.nextInt(6);
		System.out.println("You rolled a " + roll);

	}
}

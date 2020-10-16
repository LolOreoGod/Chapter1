package me.mc.ChapterThree_Threee;



/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/9/20
 * 
 * Contents: Chapter 3-3 homework, E3.12
 * 
 * Function: A car that operates on fuel
 * 
 * Constructors:
 * 	Car: constructs a car that takes a double, miles per gallon
 * 
 * Methods:
 * 
 * 	addGas: Takes a double and adds it to the gas tank
 * 	drive: Takes a double and divides it by mpg. Subtracts the result from the total gas in the gas tank
 *  getGasInTank: Returns the amount of gas left in tank as a double
 *************************************************/


public class Car {
	
	//Class variables
	private double mpg;
	private double gas = 0;


	//Car: constructs a car that takes a double, miles per gallon
	public Car(double mpg) {
		
		this.mpg = mpg;
	}
	
	//Takes a double and adds it to the gas tank
	public void addGas(double gas) {
		this.gas += gas;
	}
	
	//Takes a double and divides it by mpg. Subtracts the result from the total gas in the gas tank
	public void drive(double miles) {
		this.gas -= (miles / mpg);
	}
	
	//Returns the amount of gas left in tank as a double
	public double getGasInTank() {
		return gas;
	}

}

/******************************
 *  TESTING CAR CLASS
 *****************************/

class CarTester {
	//main method
	public static void main(String[] args) {
		//instantiates a new car object with an efficiency of 50 mpg
		Car myHybrid = new Car(50);
		//adds gas twice
		myHybrid.addGas(20);
		myHybrid.addGas(20);
		//drives for 100 miles
		myHybrid.drive(100);
		double gasLeft = myHybrid.getGasInTank();
		//Prints the amount of gas left in tank
		System.out.println(gasLeft);
	}
}

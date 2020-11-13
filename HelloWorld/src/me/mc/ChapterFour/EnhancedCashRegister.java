package me.mc.ChapterFour;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, E4.21
 * 
 * Function: Enhances the original cash register class by adding the following methods
 * 
 * Methods:
 * 	enterDollars: Records number of dollars paid
 * 	enterQuarters: Records number of quarters paid
 * 	enterDimes: Records number of dimes paid
 * 	enterNickels: Records number of nickels paid
 * 	enterPennies: Records number of pennies paid
 * 
 * 
 *************************************************/

public class EnhancedCashRegister {
	private double purchase;
	private double payment;
	private int purchases = 0;
	final private int DOLLAR = 1;
	final private double QUARTER = 0.25;
	final private double DIME = 0.10;
	final private double NICKEL = 0.05;
	final private double PENNY = 0.01;
	
	
	//Record the cost of an item purchased
	public void recordPurchase(double amount) {
		purchase += amount;
		purchases++;
	}
	

	
	//Records number of dollars paid
	public void enterDollars(int dollars) {
		payment += dollars * this.DOLLAR;
	}
	
	//Records number of quarters paid
	public void enterQuarters(int quarters) {
		payment += quarters * this.QUARTER;
	}
	
	//Records number of dimes paid
	public void enterDimes(int dimes) {
		payment += dimes * this.DIME;
	}
	
	
	//Records number of nickels paid
	public void enterNickels(int nickels) {
		payment += nickels * this.NICKEL;
	}
	
	//Records number of pennies paid
	public void enterPennies(int pennies) {
		payment += pennies * this.PENNY;
	}
	
	
	//Returns the change, if any. Resets purchase cost and payment.
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}

	//Returns the change, if any. Resets purchase cost and payment.
	public int getItemCount() {
		return purchases;
		
	}
	
}


//Driver class
class EnhancedCashRegisterTester
{
	public static void main(String[] args) {
		
	EnhancedCashRegister register = new EnhancedCashRegister();
	
	register.recordPurchase(20.37);
	register.enterDollars(20);
	register.enterQuarters(2);
	

	System.out.println("Change: " +  Math.round(register.giveChange() * 100.0) / 100.0);
	System.out.println("Expected: 0.13");

	
	}	
}


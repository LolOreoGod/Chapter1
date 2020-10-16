package me.mc.ChapterThree_Threee;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/10/20
 * 
 * Contents: Chapter 3-3 homework, P3.1
 * 
 * Function: Enhance the CashRegister class by adding a getItemCount method that returns total number of purchases
 * 
 * 
 * Methods:
 * 
 * 	recordPurchase: Record the cost of an item purchased
 * 	receivePayment: Record the payment received.
 *  giveChange: Returns the change, if any. Resets purchase cost and payment.
 *  getItemCount: Returns total number of purchases 
 *************************************************/

public class CashRegister 
{
	private double purchase;
	private double payment;
	private int purchases = 0;
	
	
	//Record the cost of an item purchased
	public void recordPurchase(double amount) {
		purchase += amount;
		purchases++;
	}
	
	
	//Record the payment received.
	public void receivePayment(double amount) {
		payment += amount;
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
class CashRegisterTester
{
	public static void main(String[] args) {
		
	CashRegister register = new CashRegister();
	
	register.recordPurchase(29.50);
	register.recordPurchase(9.25);
	register.receivePayment(50);
	
	double change = register.giveChange();
	System.out.println(change);
	System.out.println("Expected: 11.25");
	System.out.println(register.getItemCount());
	System.out.println("Expected: 2");
	
	}	
}

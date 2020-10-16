package me.mc.ChapterThree_Threee;



/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/15/20
 * 
 * Contents: Chapter 3-3 Homework, Assignment P3.9
 * 
 * Function: A bank account that allows deposites, withdrawals, and deposite/withdrawl fees.
 * 
 * Constructors:
 * 	BankAccount: Constructs a bank account with a balance 
 * 
 * Methods:
 *  deposit: Adds a deposit to the balance
 * 	withdrawal: Withdrawals money from the balance
 *  getBalance: Returns current balance
 *  deductMonthlyCharge: deducts monthly charge if they exceed the total number of free transactions
 *************************************************/

public class BankAccount {
	/**
	   A bank account has a balance that can be changed by 
	   deposits and withdrawals.
	*/

	
	   private double balance;
	   private double fee = 0;
	   private double transactionCount = 0;

	   /**
	      Constructs a bank account with a zero balance.
	   */
	   public BankAccount()
	   {   
	      balance = 0;
	   }

	   /**
	      Constructs a bank account with a given balance.
	      @param initialBalance the initial balance
	   */
	   public BankAccount(double initialBalance)
	   {   
	      balance = initialBalance;
	   }

	   /**
	      Deposits money into the bank account.
	      @param amount the amount to deposit
	      Adds 1 to the transaction count
	   */
	   public void deposit(double amount)
	   {  
	      balance = balance + amount - fee;
	      transactionCount++;
	   }

	   /**
	      Withdraws money from the bank account.
	      @param amount the amount to withdraw
	      Adds 1 to the transaction count
	   */
	   public void withdraw(double amount)
	   {   
	      balance = balance - amount - fee;
	      transactionCount++;
	   }

	   /**
	      Gets the current balance of the bank account.
	      @return the current balance
	   */
	   public double getBalance()
	   {   
	      return balance;
	   }

	   

	   /**Deducts monthly charge from the bank account
	    *
	    * @param charge the amount to charge
	    * @param freeTransactions the amount of free transactions the account has before transactions are charged
	    */
	   public void deductMonthlyCharge(double charge, int freeTransactions) {
		   
		   int transCount = (int) (Math.max(transactionCount, freeTransactions));
		   fee = charge * (transCount - freeTransactions);
		   balance -= fee;
	   }

}


class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount();
      harrysChecking.deposit(10000.0);
      harrysChecking.withdraw(500.0);
      harrysChecking.withdraw(500.0);
      harrysChecking.withdraw(1000.0);
      
      //Monthly charge of $1 after 2 free transactions
      harrysChecking.deductMonthlyCharge(1.00, 2);
      System.out.println(harrysChecking.getBalance());
      System.out.println("Expected: 7998.0");      
   }
}
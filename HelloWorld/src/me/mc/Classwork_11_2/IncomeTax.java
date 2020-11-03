package me.mc.Classwork_11_2;

import java.util.Scanner;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/2/20
 * 
 * Contents: Classwork for 11/2 E5.18
 * 
 * Function: Prints the tax one must pay based on their income, using the tax schedule from 1913
 * 
 *
 * 
 *************************************************/
public class IncomeTax {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Sets input for income
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your income: ");
		double grossincome = in.nextDouble();
		double tax = 0;
		
		
		//Tax ceilings for each max value
	    double maxTax0 = 50000.00 * .01;
	    double maxTax1 = 25000.00 * .02 + maxTax0;
	    double maxTax2 = 25000.00 * .03 + maxTax1;
	    double maxTax3 = 150000.0 * .04 + maxTax2;
	    double maxTax4 = 250000.0 * .05 + maxTax3;
	     
	     
	    //Conditional statements
		if(grossincome <= 50000) {
			tax = grossincome * 0.01;
			
		}else if (grossincome <= 75000){
			tax = ((grossincome - 50000.0) * .02 + maxTax0);
	    }else if (grossincome <= 100000){
	    	tax = ((grossincome - 75000.0) * .03 + maxTax1);
	    }else if (grossincome <= 250000){
	    	tax = ((grossincome - 100000.0) * .04 + maxTax2);
	    }else if (grossincome <= 500000){
	    	tax = ((grossincome - 250000.0) * .05 + maxTax3);
	    }else if ( grossincome > 500000){
	    	tax = ((grossincome - 500000.0) * .06 + maxTax4);
	    }
		
		//Prints out the tax they must pay
		System.out.println("Your income tax is: " + tax);		
	}

}

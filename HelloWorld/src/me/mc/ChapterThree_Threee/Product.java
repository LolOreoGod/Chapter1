package me.mc.ChapterThree_Threee;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/9/20
 * 
 * Contents: Chapter 3-3 homework, E3.13
 * 
 * Function: A product with a name and price and price reduction
 * 
 * Constructors:
 * 	Product: Constructs a product with a name string and price double
 * 
 * Methods:
 * 	reducePrice: Takes a double and subtracts it from the total price.
 * 	getName: Takes a name string and returns it
 * 	getPrice: Takes the price double and returns it
 * 
 *************************************************/


public class Product {
	
	//Class variables
	private String name;
	private double price;


	//Constructs a product with a name string and price double
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Takes a double and subtracts it from the total price.
	public void reducePrice(double reduction) {
		price -= reduction;
		
	}
	
	//Takes a name string and returns it
	public String getName() {
		return name; 
	}
	
	//getPrice: Takes the price double and returns it
	public double getPrice() {
		return price;
		
	}
	
	
}

/******************************
 *  TESTING CAR CLASS
 *****************************/

class ProductPrinter {
	//main method
	public static void main(String[] args) {
		//Instantiates two products with given values
		Product cake = new Product("Cake", 50.00);
		Product chocolate = new Product("Chocolate", 30.00);
		
		//Prints each product's name and price
		System.out.println(cake.getName() + " " + cake.getPrice());
		System.out.println(chocolate.getName() + " " + chocolate.getPrice());
		
		//Reduces each product's price by 5.00
		cake.reducePrice(5.00);
		chocolate.reducePrice(5.00);
		
		//Prints each product's name and price after reduction
		System.out.println(cake.getName() + " " + cake.getPrice());
		System.out.println(chocolate.getName() + " " + chocolate.getPrice());
	}
}
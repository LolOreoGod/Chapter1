package me.mc.ChapterFour;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 11/12/20
 * 
 * Contents: Chapter 4 Homework, P3.13
 * 
 * Function: An advanced HelloWorld program
 * 
 * Constructors:
 * 	Greeter: Constructs a greeter
 * 
 * Methods:
 * 	sayHello: Takes name, returns with Hello
 *  sayGoodbye: Takes name, returns with Goodbye
 *  refuseHelp: Takes name, returns with refusal
 * 
 *************************************************/

public class Greeter {

/* 
 * Class variables
 */
private String name; 
private String hello = "Hello, ";
private String bye = "Goodbye, ";
private String refuse = "I'm so sorry, ";

 
	/*
	 * Greeter constructor
	 * @param name name of person
	 */
	public Greeter(String name) {
		this.name = name;
		
	}
	
	/*
	 * sayHello method
	 * @return Hello, @param name
	 */
	public String sayHello() {
		
		this.hello = this.hello.concat(name);
		return hello;
	}
	
	/*
	 * sayGoodbye method
	 * @return Goodbye, @param name
	 */
	public String sayGoodbye() {
		
		this.bye = this.bye + name + ".";
		return bye;
	}
	
	
	/*
	 * refuseHelp method
	 * @return I'm so sorry, @param name. I am afraid I can't do that.
	 */
	public String refuseHelp() {
		
		this.refuse = this.refuse + name + ". I am afraid I can't do that.";
		return refuse;
	}
	
	
}

/*
 * Driver class
 */
class GreeterTest {
	public static void main(String[] args) {
		//Constructs Greeter dave and sarah
		Greeter dave = new Greeter("Dave");
		Greeter sarah = new Greeter("Sarah");
		
		//Testing sayHello
		System.out.println(dave.sayHello());
		System.out.println(sarah.sayHello());
	
		//Testing sayGoodbye
		System.out.println(dave.sayGoodbye());
		
		//Testing refuseHelp
		System.out.println(dave.refuseHelp());
		
		System.out.println(sarah.refuseHelp());
	}
}



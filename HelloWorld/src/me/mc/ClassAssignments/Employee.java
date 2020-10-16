package me.mc.ClassAssignments;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/12/20
 * 
 * Contents: Employee class
 * 
 * Function: Change all instance variables
 * 
 * Constructors:
 * 	Employee: Default constructor, no params
 *  Employee: (String)name, (int)id, (double)salary
 * 
 * Methods:
 *  getName: Returns employee name
 * 	getId: Returns employee id
 * 	getSalary: Returns employee salary
 *  setName: Sets employee name
 *  setId: Sets employee id
 *  setSalary: Sets employee salary
 *  addSalary: Increases employee salary
 *************************************************/

public class Employee {
	
	//instance variables
	private String name;
	private double salary;
	private int id;
	
	
	//default constructor, no params
	public Employee() {
		this("", 0, 0.0);
		
	}
	
	//constructor, name, id, salary params
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	//returns name
	public String getName() {
		return name;
		
	}
	
	
	//returns id
	public int getId() {
		return id;
		
	}
	
	
	//returns salary
	public double getSalary() {
		return salary;
		
	}

	//sets employee id
	public void setId(int id) {
		this.id = id;
	}
	
	
	//sets employee salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//sets employee name
	public void setName(String name) {
		this.name = name;
	}
	
	
	//sets employee salary
	public void addSalary(double add) {
		this.salary += add;
	}
}


//driver class
class EmployeeTester {
	
	//main mathod
	public static void main(String[] args) {
		//instantiating employee object
		Employee one = new Employee();
		Employee two = new Employee("Mark", 1000, 30000.05);
		
		
		//mutating employee one
		one.setId(10012222);
		one.setName("Sam");
		one.setSalary(30000);
		
		//mutating employee two
		two.addSalary(10);
		
		
		//TESTING
		System.out.println(one.getName() + " " + one.getId() + " " + one.getSalary());
		System.out.println("Expected values for employee one: Name: Sam, ID: 10012222, Salary: 30,000");
		
		System.out.println(two.getName() + " " + two.getId() + " "  + two.getSalary());
		System.out.println("Expected value for employee two: Name: Sam, ID: 1000, Salary: 30,010.05");
		
	
	}
	
	
}
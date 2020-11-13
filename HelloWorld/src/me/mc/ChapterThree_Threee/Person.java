package me.mc.ChapterThree_Threee;

/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 10/15/20
 * 
 * Contents: Chapter 3-3 Homework, Assignment P3.6
 * 
 * Function: Modified the person class from P3.5 and added a getFriendCount method
 * 
 * Constructors:
 * 	Person: constructs a person with a first name
 * 
 * Methods:
 *  befriend: Adds a string to friends
 * 	unfriend: Removes a string from friends
 *  getPersonName: Returns name of person
 *  getFriendName: Returns name of friends
 *************************************************/

public class Person {
	
	private String name;
	private int friends;
	private String friendsNames = "";
	
	
	//PERSON CONSTRUCTOR with a first name
	public Person(String name) {
		this.name = name;
		this.friends = 0;
		
	}
	
	
	//befriend method, adds a string to friends
	public void befriend(String p) {

		if (!friendsNames.contains(p)) {
			friendsNames += p + " ";
			friends++;
		}
	}
	
	
	
	//unfriend method, removes a string from friends
	public void unfriend(String p)
	{
		if (friendsNames.contains(p)) {
				String[] parseNames = friendsNames.split(p);
			    friendsNames = parseNames[0] + parseNames[1];
			    friends--;
		}
	}
	
	
	
	//getPersonName method, returns person name
	public String getPersonName() {
		return name;
	}
	
	
	//getFriendCount method, returns total number of friends
	public int getFriendCount() {
		return friends;
	}
	
	
	
	//getFriendsNames method, returns friends
	public String getFriendsNames() {
		return friendsNames;
	}

}

//driver class
class PersonTester {
	public static void main(String[] args) {
		//define one person and their properties
		Person one = new Person("Mark");
		one.befriend("Beatrice");
		one.befriend("Tyler");
		one.unfriend("Tyler");
		
		//TESTING
		System.out.println(one.getFriendsNames());
		System.out.println("Expected output: Beatrice");
		System.out.println(one.getFriendCount());
		System.out.println("Expected output: 1");
	}
}

package me.mc.ChapterOne;

import java.util.*;

public class MyList {

//E1.19 
	public static void main(String args[]) {
		System.out.println("=== My friend's birthdays ===");
		ArrayList<String> list = new ArrayList<String>();
			list.add("Friend 1");
			list.add("Friend 2");
			list.add("Friend 3");
			
			//LIST for friend names
		
		ArrayList<String> list2 = new ArrayList<String>();
			list2.add("Jan 1");
			list2.add("Jan 2");
			list2.add("Jan 3");
			
			//LIST for birthdays 
			
		ListIterator<String> lItr = list.listIterator();
		ListIterator<String> l2Itr = list2.listIterator();
		
			//Create list iterators so you can cycle through them 1 at a time
		
			while (lItr.hasNext() && l2Itr.hasNext()) {
				System.out.println(lItr.next() + "     " + l2Itr.next());
				//The actual iterating
			}
		
	}
	
}

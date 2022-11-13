//Question 24 Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.*;  
class Q24
{  
	public static void main(String args[]) 
	{
		HashMap <Integer,String> hashmap = new HashMap <Integer,String> ();
		hashmap.put(10, "Red");
		hashmap.put(20, "Green");
		hashmap.put(30, "Black");
		hashmap.put(40, "White");
		hashmap.put(50, "Blue");
	
		boolean result = hashmap.isEmpty();
		
		System.out.println("Is hashmap empty: " + result);
		
		hashmap.clear();
		
		result = hashmap.isEmpty();
		
		System.out.println("Is hashmap empty: " + result);
	}
}
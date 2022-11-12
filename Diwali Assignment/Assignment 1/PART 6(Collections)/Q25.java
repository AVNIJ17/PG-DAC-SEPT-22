// Question 25 Write a Java program to get the value of a specified key in a map.

import java.util.*;  
class Q25 
{  
	public static void main(String args[])
	{  
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(11,"Pink");
		hash_map.put(21,"Orange");
		hash_map.put(31,"Purple");
		hash_map.put(41,"White");
		hash_map.put(51,"Blue");
	
		String val=(String)hash_map.get(31); 
		
		System.out.println("Value for key 31 is: " + val);
	}
}
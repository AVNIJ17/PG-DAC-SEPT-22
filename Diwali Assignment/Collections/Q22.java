//Question 22 Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.*;  
class Q22 
{  
   public static void main(String args[])
    {  
		HashMap<Integer,String> hashmap= new HashMap<Integer,String>();  
		hashmap.put(1, "Red");
		hashmap.put(2, "Green");
		hashmap.put(3, "Black");
		hashmap.put(4, "White");
		hashmap.put(5, "Blue");
		System.out.println("Size of the hash map: "+hashmap.size());
	}
}
//Question 17 Write a Java program to convert a hash set to an array.

import java.util.*;
class Q17{
	public static void main(String[] args) 
	{
    HashSet<String> hashset = new HashSet<String>();
 
          hashset.add("Red");
          hashset.add("Green");
          hashset.add("Black");
          hashset.add("White");
          hashset.add("Pink");
          hashset.add("Yellow");
		
		System.out.println("Original Hash Set: " + hashset);
		
		String[] newarray = new String[hashset.size()];
        hashset.toArray(newarray);
 
		System.out.println("Array elements: ");
		for(String element : newarray)
		{
			System.out.println(element);
		}
	}
}
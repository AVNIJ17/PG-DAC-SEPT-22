//Question 16 Write a Java program to empty an hash set.

import java.util.*;
class Q16{
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
		hashset.removeAll(hashset);
		System.out.println("After removing "+hashset);  

    }
}
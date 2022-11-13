//Question 15 Write a Java program to iterate through all elements in a hash list.

import java.util.*;
class Q15{
	public static void main(String[] args) 
	{
    HashSet<String> hashset = new HashSet<String>();
 
          hashset.add("Red");
          hashset.add("Green");
          hashset.add("Black");
          hashset.add("White");
          hashset.add("Pink");
          hashset.add("Yellow");


    Iterator<String> p = hashset.iterator();
	while (p.hasNext()) 
	{
    System.out.println(p.next());
    }
    }
}
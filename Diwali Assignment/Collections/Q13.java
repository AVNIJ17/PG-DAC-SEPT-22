//Question 13 Write a Java program to compare two linked lists.

import java.util.*;
class Q13{
	public static void main(String[] args)
	{
		LinkedList<String> c1= new LinkedList<String>();
        c1.add("Apple");
        c1.add("Orange");
        c1.add("PineApple");
        c1.add("Watermelon");
        c1.add("Bannana");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Cherry");
        c2.add("Apple");
        c2.add("PineApple");
        c2.add("Orange");

        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
            System.out.println(c3);         
     }
}
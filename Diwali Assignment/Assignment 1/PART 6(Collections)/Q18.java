//Question 18 Write a Java program to compare two sets and retain elements which are same on both sets

import java.util.*;
class Q18{
	public static void main(String[] args) {
     
        HashSet<String> hashset1 = new HashSet<String>();
     
          hashset1.add("Rectangle");
          hashset1.add("Square");
          hashset1.add("Circle");
          hashset1.add("Triangle");
          System.out.println("Frist HashSet content: "+hashset1);
		  
          HashSet<String>hashset2 = new HashSet<String>();
          hashset2.add("Triangle");
          hashset2.add("Circle");
          hashset2.add("Cube");
          hashset2.add("Cuboid");
          System.out.println("Second HashSet content: "+hashset2);
		  
          hashset1.retainAll(hashset2);
          System.out.println("HashSet content:");
          System.out.println(hashset1);
     }
}
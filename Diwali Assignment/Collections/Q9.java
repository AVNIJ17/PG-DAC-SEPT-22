//Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.*;
class Q9
{
	public static void main(String args[])
	{
		List<String> list=new LinkedList<>();
		list.add("apple");
		list.add("orange");
		list.add("pineapple");
		list.add("watermelon");
		list.add("guava");
		
		System.out.println("before adding:" +list);
		list.add(3,"bannana");
		System.out.println("after adding:" +list);
	}
}
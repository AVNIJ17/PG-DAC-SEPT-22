//Write a Java program to insert elements into the linked list at the first and last position.

import java.util.*;
class Q10
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<>();
		list.add("apple");
		list.add("orange");
		list.add("pineapple");
		list.add("watermelon");
		list.add("guava");
		
		System.out.println("before adding:"+list);
		list.addFirst("dragonfruit");
		list.addLast("greenapple");
		System.out.println("after adding:"+list);
	}
}
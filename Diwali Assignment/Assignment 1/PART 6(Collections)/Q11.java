//Write a Java program to display the elements and their positions in a linked list.

import java.util.*;
class Q11
{
	public static void main(String args[])
	{
		List<String> list=new LinkedList<>();
		list.add("apple");
		list.add("orange");
		list.add("pineapple");
		list.add("watermelon");
		list.add("guava");
		
		System.out.println(list);
	

		for(int p=0; p<list.size(); p++)
		{
			System.out.println("Element at index "+p+": "+list.get(p));
		} 
	}
}
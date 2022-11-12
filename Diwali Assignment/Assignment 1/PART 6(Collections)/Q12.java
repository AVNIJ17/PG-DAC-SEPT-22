//Write a Java program to check if a particular element exists in a linked list.

import java.util.*;
class Q12
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
		if(list.contains("apple"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
	}
}
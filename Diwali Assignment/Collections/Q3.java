//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
public class Q3
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("orange");
		list.add("black");
		list.add("pink");
		list.add("red");
		list.add("blue");
		System.out.println(list);
		list.add(0,"purple");
		System.out.println(list);
		
		String a1=list.get(2);
		System.out.println(a1);
	}
}
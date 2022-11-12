//Write a Java program to insert an element into the array list at the first position.

import java.util.*;
public class Q2
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
	}
}
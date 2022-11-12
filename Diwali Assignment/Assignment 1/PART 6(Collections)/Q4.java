//Write a Java program to sort a given array list.

import java.util.*;
public class Q4
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("orange");
		list.add("black");
		list.add("pink");
		list.add("red");
		list.add("blue");
		System.out.println("List before sorting:"+list);
		Collections.sort(list);
		System.out.println("List after sorting:"+list);
	}
}

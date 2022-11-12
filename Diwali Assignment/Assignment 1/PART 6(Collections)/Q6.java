//Write a Java program of swap two elements in an array list.

import java.util.*;
public class Q6
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("orange");
		list.add("black");
		list.add("pink");
		list.add("red");
		list.add("blue");
		System.out.println("List before swaping:"+list);
		Collections.swap(list,2,4);
		System.out.println("List after swaping:"+list);
	}
}
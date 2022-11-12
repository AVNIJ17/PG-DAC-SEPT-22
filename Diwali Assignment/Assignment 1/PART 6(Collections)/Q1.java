//Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.*;
public class Q1
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		list.add(s1);
		list.add("orange");
		list.add("black");
		list.add("pink");
		list.add("red");
		list.add("blue");
		System.out.println(list);
	}
}
		
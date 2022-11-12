//Write a Java program to print all the elements of a ArrayList using the position of the elements.

import java.util.*;
class Q7
{
	public static void main(String args[])
	{
		ArrayList<Integer> i1=new ArrayList<>();
		i1.add(23);
		i1.add(55);
		i1.add(65);
		i1.add(12);
		i1.add(90);
		System.out.println(i1);
		int n =i1.size();
		for(int index=0;index<n;index++)
		{
			System.out.println(i1.get(index));
		}
	}
}
//Question 19 Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.*;
class Q19
{
	public static void main(String[] args)
	{
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Purple");
		treeset.add("Pink");
		treeset.add("Orange");
		treeset.add("Blue");
		treeset.add("Black");
		System.out.println("Tree set: ");
		System.out.println(treeset);
	}
}
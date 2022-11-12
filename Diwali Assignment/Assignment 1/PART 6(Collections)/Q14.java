//Question 14 Write a Java program to replace an element in a linked list.

import java.util.*;
class Q14{
	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Black");
		l1.add("White");
		l1.add("Pink");
		System.out.println("Original linked list: " + l1);
		l1.set(4, "Purple");
		System.out.println("New linked list: " + l1);
	}
}
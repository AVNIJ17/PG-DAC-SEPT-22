//Q4 Write a program to reverse an Array in java .

import java.util.Scanner;
class Q4
{
	public static void main(String args[])
	{
		
		int arr[]=new int[]{11,33,44,55,66};
		System.out.print("Array elements are: ");  
		int n=arr.length;
		for (int i=0; i<n; i++)   
		{  
			System.out.println(arr[i]+ " ");  
		} 
		System.out.println("enter the elements of array AFTER REVESING:");
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
//Q24 Write a program to find second largest element in a given Array in java?

import java.util.*;
class Q24
{
	public static void findKthLargest(int arr[],int k)
	{
		Arrays.sort(arr);
		System.out.println(k+"th largest element:: ");
		System.out.println(arr[arr.length-k]);
	}
	public static void main(String[] args) 
	{
		int arr[]={6,5,7,0,9,4,3};
		System.out.println("Input Array:");
		for(int n:arr)
		{
			System.out.print(n+",");
		}
		System.out.println();
		findKthLargest(arr,3);
	}

}
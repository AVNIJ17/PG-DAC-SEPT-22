//Q2 Write a Java program to check the equality of two arrays?

class Q2
{
	public static void main(String args[])
	{
		int a1[]=new int[]{33,55,66,33,44};
		int a2[]=new int[]{32,54,56,49};
		
		if(a1.length==a2.length)
		{
			System.out.println("Given arrays are equal");
		}
		else
		{
			System.out.println("Given arrays are not equal");
		}
	}
}
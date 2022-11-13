//Q14 Write a program to check whether two given Arrays are equal, given both contains same data type and same length ?

class Q14
{
	public static void isEqual(int arr1[],int arr2[])
	{
		boolean flag=false;
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
				{
					flag=true;
				}


			}

		}
		if(flag)
			System.out.println("Equal");
		else
		 System.out.println("Not Equal");

	}	
	public static void main(String ... args)
	{
		int arr1[]={11,21,31,41,51};
		int arr2[]={11,21,31,41,51};
		isEqual(arr1,arr2);
		
	}
}	

//Q18 How to find duplicate elements in a given Array

class Q18
{
	public static void findDuplicate(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}


	}
	public static void main(String[] args) {
		int arr[]={11,21,31,11,41,51,51};
		findDuplicate(arr);
	}
}
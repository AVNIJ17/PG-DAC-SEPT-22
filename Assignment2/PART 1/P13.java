class P13
{
public static void main(String args[])
{
	for(char i=65;i<=69;i++)
	{
		for(char j=68;j>=i;j--)
		{
		System.out.print(" ");
		}
		for(char j=65;j<=i;j++)
		{
		System.out.print(i+" ");
		}
		
	System.out.println();
	}
}
}
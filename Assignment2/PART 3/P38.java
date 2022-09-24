class P38
{

public static void main(String args[]){
	
	for(int i=1;i<=9;i++)//rows
	{
		for(int j=9;j>=i;j--)//space
		{
			System.out.print("  ");			
		}
		for(int j=1;j<=i;j++)//star
		{
			System.out.print(" "+j);	
		}
	    for(int j=i-1; j>=1; j--)   
		{   
        
			System.out.print(" "+j);
		} 
		System.out.println();
	}	
} 
}
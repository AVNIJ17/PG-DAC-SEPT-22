//Q2

import java.util.*;
class Q2

{
	static boolean check(String str)
	{
		if( str.equals(str.toUpperCase()) ||str.equals(str.toLowerCase()))
		{   
			return true;
		}
        else
		{
				char first=str.charAt(0);
				boolean res=Character.isUpperCase(first);
				if(res)
				{
					for(int i=1;i<str.length();i++)
					{
						char nextElement=str.charAt(i);
						res=Character.isUpperCase(nextElement);
						if(res)
						{
							return false;
						}
					}
					return true;
				}
				else
				{
					
					return false;
					
				}
		}
		
	}		
	
	public static void main(String []args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String For Capitalization Checking : ");
		String str=sc.nextLine();
		
		System.out.println("Result : "+check(str));
	}	
}
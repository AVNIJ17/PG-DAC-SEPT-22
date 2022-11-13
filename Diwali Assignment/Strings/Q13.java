//Q13
import java.util.Scanner;
class Q13
{
	static void display(String str,String res)
	{
		if(str.length()==0){			
			System.out.println(res);
			
		}
		
		for(int i=0;i<str.length();i++)
		{
			char s=str.charAt(i);
			String s1=str.substring(0,i) + str.substring(i+1);
			display(s1,res+s);
				
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String r=sc.nextLine();
		display(r,"");
	}
}
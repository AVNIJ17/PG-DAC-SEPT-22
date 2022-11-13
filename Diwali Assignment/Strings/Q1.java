//Q1
import java.util.*;
class Q1
{
    public static void main(String argu[]) 
	{
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		char[] c1 = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
				if (c1[i] == c1[j]) 
				{
				   System.out.print(c1[j] + " ");
                }
            }
        }
    }
}
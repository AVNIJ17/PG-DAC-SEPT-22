//Q1

import java.io.*;
class Q1 
{
	public static boolean isPalindrome(String str)
    {
		String rev = "";
		boolean ans =false;
 
        for (int i = str.length() - 1; i >= 0; i--) 
		{
            rev = rev + str.charAt(i);
        }
	
        if (str.equalsIgnoreCase(rev)) 
		{
            ans = true;
        }
		
        return ans;
    }
    public static void main(String[] args)
    {
        
        String str = "A man, a plan, a canal: Panama.";
		str=str.replace(" ","");
		str=str.replace(":","");
		str=str.replace(",","");
		str=str.replace(".","");
        System.out.println(isPalindrome(str));
    }
}
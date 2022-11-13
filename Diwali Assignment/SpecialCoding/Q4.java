//Q4,5

import java.util.*;
class Q4
{
	public static String sumBinary(String s1,String s2)
	{
        StringBuilder sb1 = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() -1, carry = 0;
        while (i >= 0 || j >= 0)
		{
            int sum = carry;
            if (j >= 0) sum += s2.charAt(j--) - '0';
            if (i >= 0) sum += s1.charAt(i--) - '0';
            sb1.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb1.append(carry);
        return sb1.reverse().toString();
    }


public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	
	System.out.println(sumBinary(s1,s2));
	
}	
}


//Q10

import java.util.Scanner;
class Q10
{
	public static int numJewelsInStones(String jewels, String stones) 
    {
        int count=0;
        for(char c:stones.toCharArray())
        {
            if(jewels.indexOf(c)!=-1)
                count++;
        }
        return count;
    }
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(numJewelsInStones(str1,str2));
}	
}
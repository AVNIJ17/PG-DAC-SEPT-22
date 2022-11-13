//Q11

import java.util.*;
class Q11 {
    public static String mergeAlternately(String str1, String str2) {
    String  ans ="";
        int ab =0;
        int ac =0;
        
        for(int i=0;i<str1.length()+str2.length();i++){       
            if(i<str1.length()){
                ans+=str1.charAt(ab);
                ab++;
            }
            if(i<str2.length()){
                ans +=str2.charAt(ac);
                ac++;
            }
        }   
    return ans;
    }
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(mergeAlternately(str1,str2));
	}
}
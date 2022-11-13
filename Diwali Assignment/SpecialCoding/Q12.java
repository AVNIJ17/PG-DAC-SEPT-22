//Q12

import java.util.*;
class Q12 {
    public static int countHomogenous(String s) {
        int c=1;
        int res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
              
                c++;
                
            }
            else{
                c=1;
                
                
              
            }
           res=(res+c)%10;
        }
        return res+1;
    }
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(countHomogenous(str));
	}
}
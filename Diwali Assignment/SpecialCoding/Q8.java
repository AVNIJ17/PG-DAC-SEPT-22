//Q8
import java.util.*;

class Q8 
{
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(validPalindrome(str));
	}
}
//Q14

import java.util.*;

class Q14 
{
	static int i = 0;
	public static String reverse(String str) {
		if(str.length() == 0) {
			return str;
		}	
		str = reverse(str.substring(1))+str.charAt(0);
		return str;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.println("Reverse : "+reverse(str));
	}
}
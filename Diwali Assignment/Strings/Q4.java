//Q4
import java.util.*;
class Q4 
{
	public static void FirstNonRepeat(String s) 
	{

		for (int i = 0; i < s.length(); i++)
		{

			if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1)
			{
				System.out.println("First non-repeating character is " + s.charAt(i));
				break;
			}
		}
		return;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		FirstNonRepeat(s);
  }
}
//Q3
import java.util.Scanner;
class Q3
{    
   public static boolean Check(String moves) {
	   
        int x=0,y=0;
        for(int i=0;i<moves.length();i++)
        {
            char c1=moves.charAt(i);
            
            if(cl=='L')
            {
				x++;
			}
            if(cl=='R')
            {
                x--;
            }
            if(cl=='U')
            {
                y++;
            }
            if(cl=='D')
            {
                y--;
            }
            
            
            
        }
        return x==0 && y==0;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Moves :  ");
		String str=sc.nextLine();
		
		System.out.print("Result:"+Check(str));
	}
}
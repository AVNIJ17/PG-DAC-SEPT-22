//Q4
class Q4
{
	static String msg = "CdacMumbai";
    static class InnerClass 
	{
		public void display()
		{
			System.out.println("Welcome to " + msg);
		}
    }
  
	
    public static void main(String args[])
    {
       
        InnerClass i1 = new InnerClass();
		i1.display();
    }
}
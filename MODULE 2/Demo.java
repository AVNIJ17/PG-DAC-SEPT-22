import java.util.Scanner;


class MathOperation
{
	static int add(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	
	static int subtract(int x,int y)
	{
		int subtract=x-y;
		return subtract;
	}
	static int multiply(int x,int y)
	{
		int multiply=x*y;
		return multiply;
	}
	static int power(int x,int y)
	{
		int power=(int)Math.pow(x,y);
		return power;
	}
}

class Demo
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number:");
	int x=sc.nextInt();
	System.out.println("Enter second number:");
	int y=sc.nextInt();
	
	int res1=MathOperation.add(x,y);
	System.out.println(res1);
	int res2=MathOperation.subtract(x,y);
	System.out.println(res2);
	int res3=MathOperation.multiply(x,y);
	System.out.println(res3);
	int res4=MathOperation.power(x,y);
	System.out.println(res4);
	}
}
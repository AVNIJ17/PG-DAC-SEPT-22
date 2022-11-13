//Q8

class Demo{
	
	static int count; 
	
	Demo(){
		count++;
	}
	
}
class Q8
{

	public static void main(String[] args){
		
		new Demo();
		new Demo();
		new Demo();	
		
		System.out.println("Number of Demo Objects created is: " + Demo.count);
	}
}
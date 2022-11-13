//Q25

class Q25{
	
	Q25(){
		System.out.println("Inside the Constructor Q25");
		
	}
	
	static{
		
		System.out.println("Inside the static Q25"); //Executed without object and call only once
	}
	
	{
		
		System.out.println("Inside the non-static Q25");
	}
	
	public static void main(String args[]){
		Q25 obj=new Q25();//Static then non-static then constructor
		Q25 obj1=new Q25(); ///How many object ==Non static and constructor call
	}
}
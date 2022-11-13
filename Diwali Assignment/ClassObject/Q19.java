//Q19

class Q19
{
	
	int rollNo;
	String name;
	
	Q19(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	void get(){
		
		System.out.println("Roll No "+ rollNo);
		System.out.println("Name "+ name);
	}
	public static void main(String args[]){
		Q19 obj=new Q19(100,"Rajesh");
		obj.get();
		
	}
}
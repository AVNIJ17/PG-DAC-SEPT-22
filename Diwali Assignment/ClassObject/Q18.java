//Q18

class Q18{
	int rollNo;
	String name;
	Q18(){ 
		this.rollNo=10;
		   
	}
	
	Q18(String name){ 
		this();//call default constructor 
		this.name=name;   
	}
	public static void main(String args[]){
		Q18 obj =new Q18("Om");
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}
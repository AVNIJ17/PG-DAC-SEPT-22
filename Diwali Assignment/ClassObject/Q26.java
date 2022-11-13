//Q26

class Q26{
	
	 void add(byte a,byte b){
		 
		 int sum=(int)a+(int)b;
		 System.out.println(sum);
	 }
	
	public static void main(String args[]){
		
		byte a=10;
		byte b=30;
		
		
		Q26 obj=new Q26();
		System.out.println("Sum of Byte value is: ");
		obj.add(a,b);
		
	}
}
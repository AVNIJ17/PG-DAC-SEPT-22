//Q10

class Q10{
	
	Q10 obj3;
	void swap(Object obj1,Object obj2){
		
		System.out.println("Before Swapping Object 1 :"+ obj1);
		System.out.println("Before Swapping Object 2 :"+obj2);
		
		
		Q10 obj3=(Q10)obj1;
		obj1=(Q10)obj2;
		obj2=(Q10)obj3;
		
		System.out.println("After Swapping Object 1 :"+ obj1);
		System.out.println("After Swapping Object 2 :"+obj2);
	}
	public static void main(String args[]){
		Q10 obj1=new Q10();
		Q10 obj2=new Q10();
		obj2.swap(obj1,obj2);
		
		
		
	}
}
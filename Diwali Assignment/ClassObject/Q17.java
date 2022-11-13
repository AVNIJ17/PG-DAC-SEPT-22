//Q17

class Q17{
	int rollNo;
	String name;
	Q17(){ //To initialize default value
		this.rollNo=10;
		name="XYZ";   //this.name="XYZ" //if same variable name is not then no need to use this keyword
	}
	public static void main(String args[]){
		Q17 obj =new Q17();
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}


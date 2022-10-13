class Complex
{
	float real;
    float imaginary;
	
	public Complex()
    {
        real = imaginary = 0;
    }
	
	public Complex(float real) 
	{
        this.real = real;
        this.imaginary = 0;
    }
	
    public Complex(float real, float imaginary) 
	{
        this.real = real;
        this.imaginary = imaginary;
    }
	
	public Complex add(Complex c) 
	{
        Complex com=new Complex();
        com.real =real + c.real;
        com.imaginary =imaginary+ c.imaginary;
        return com;
    }

    public Complex multiply(Complex c) 
	{
        Complex com=new Complex();
        com.real =real * c.real;
        com.imaginary =imaginary* c.imaginary;
        return com;
    }
    
    public void print() 
	{
        
        System.out.println(real+ " + i"+imaginary);
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);
        
        Complex c3=c1.add(c2);
        
        System.out.print("Sum of The Complex Numbers : ");
        c3.print();

        c3 = c1.multiply(c2);
        System.out.print("Product of The Complex Numbers : ");
        c3.print();
    }
}
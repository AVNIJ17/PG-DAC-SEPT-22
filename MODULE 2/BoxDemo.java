

class Box
{
	int height;
	int width;
	int breadth;
	
	Box()
	{
	}
	
	Box(int height,int width,int breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	public int getVolume()
	{
		int volume=height*width*breadth;
		return volume;
		
	}
	
	public int getArea()
	{
		int area=2*((height*width) + (width*breadth) + (height*breadth));
		return area;
		
	}
	
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box(1,2,3);
        System.out.println("Volume of first box is "+ b1.getVolume());
        System.out.println("Surface Area of first box is "+ b1.getArea());

        Box b2 = new Box(4,5,6);
        System.out.println("Volume of second box is " + b2.getVolume());
        System.out.println("Surface Area of second box is " + b2.getArea());
		
		    
	}
}
		
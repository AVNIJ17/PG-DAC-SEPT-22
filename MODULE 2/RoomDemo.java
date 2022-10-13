
class Room
{
	int height;
	int width;
	int breadth;
	
	public void volume(int height,int width,int breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	void displayvolumeofroom()
	{
		int vol=height*width*breadth;
		System.out.println("Volume of room is =" +vol);
		
	}
}

class RoomDemo
{
	public static void main(String args[])
	{
		Room r1=new Room();
		r1.volume(5,6,7);
		
		r1.displayvolumeofroom();
		
	}
}
class Student
{
	String name;
	double total;
	double marks[]=new double[3];
	
	void setValues(String name, int val[])
	{
        this.name = name;
        for(int i = 0; i < 3; i++)
		{
            marks[i] = val[i];
		
        }
		
    }
	double total()
	{
	    double total=0.0;
        for(int i = 0; i < 3; i++)
		{
            total = total + marks[i];
        }
		total=total;
        return total;
	}
		
    double totalAverage()
	{
        double ans = 0.0;
        for(int i = 0; i < 3; i++)
		{
            ans = ans + marks[i];
        }
        ans = ans / 3.0 ;
        return ans;
    }

    void display()
	{
        
        System.out.println("Name: " + name);
        System.out.println("Total marks: " + total());
    }

    public static void main(String args[])
	{
        int val[] = {90, 80, 85};
        Student s = new Student();
        s.setValues("Avni", val);

        s.display();
		
        System.out.println("The average marks is: " + s.totalAverage());
		
    }
}
	
//Q23 How to convert ArrayList to String Array in java ?

import java.util.*;  
public class Q23
{  
        public static void main(String[] args)   
        {     
        ArrayList<String> list= new ArrayList<String>();   
		list.add("Welcome"); 
		list.add("to");  
		list.add("Coding World!!!");  
		String array[] = new String[list.size()];                
        for(int j =0;j<list.size();j++)
		{  
            array[j] = list.get(j);  
        }  
        for(String k: array)  
        {  
            System.out.println(k);  
        }  
    }  
}  
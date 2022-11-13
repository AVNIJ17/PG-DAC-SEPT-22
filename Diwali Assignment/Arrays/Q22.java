//Q22 How to convert Array to TreeSet in java ?

import java.util.*;
class Q22
 {
    public static void main(String args[]) 
	{
        
    Integer[] num = {11,22,44,34,55,67,87};
    
    List<Integer> list = Arrays.asList(num);
    Set<Integer> set = new TreeSet<Integer>(list);
   
    System.out.println("The Set elements are :");
    for(Integer var : set)
        System.out.println(var);
    }
}
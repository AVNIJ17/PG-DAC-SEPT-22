//Q21 How to convert Array to ArrayList in java ?

import java.util.*;
class Q21
{
    public static void main (String[] args)
    {
        String[] str = {"Reema", "Seema","Suresh", "Manish"};
		List al = Arrays.asList(str);
        System.out.println(al);
    }
}
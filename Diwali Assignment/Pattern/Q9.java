//Q9

import java.lang.*;
import java.util.*;

class Q9{
	
	public static void main(String args[]){
		
		int x  = 6;
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(" ");
			}
			
			for(int j = i; j <= 5; j++){
				
				System.out.print(j+" ");
			}
			
			
			
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++){
			
			for(int j = i; j <= 5; j++){
				
				System.out.print(" ");
			}
			
			x--;
			
			for(int j = x; j <= 5; j++){
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
}
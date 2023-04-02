package com.logical;

public class EvenOddWithoutModulasOperator {

	 // Returns true if n
   // is even, else odd
   static boolean isEven(int n)
   {
       boolean is = true;
        
       for (int i = 1; i <= n; i++)
           is = !is;
            
       return is;
   }
    
    
   // Driver Code
   public static void main(String args[])
   {
        
       int n = 10;
       if(isEven(n))
           System.out.println("Even");
       else
           System.out.println("Odd");
        
   }	
			
}

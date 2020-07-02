package patternproblems;

import java.util.Scanner;
public class pat11
{
	private static Scanner sc;
	static void printpattern(int n)
	{  
	     
        for (int i = 1; i <= n; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= n; j++) 
            { 
                System.out.print(j); 
            } 
             
            System.out.println(); 
        }
        
        
        for (int i = n-1; i>=1 ; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= n; j++) 
            { 
                System.out.print(j); 
            } 
             
            System.out.println(); 
        }
        
        
        
        
        
        
        
        
	}
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        int n=sc.nextInt();
        printpattern(n);
	}

}

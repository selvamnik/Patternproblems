package patternproblems;

import java.util.Scanner;
public class pat9
{
	private static Scanner sc;
	static void printpattern(int n)
	{  
		 for (int i = 1; i <= n; i++) 
	        {
	            //Printing first half of the row
	             
	            for (int j = 1; j <= i; j++) 
	            { 
	                System.out.print(j+" "); 
	            }
	             
	            //Printing second half of the row 
	             
	            for (int j = i-1; j >= 1; j--)
	            {
	                System.out.print(j+" ");
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

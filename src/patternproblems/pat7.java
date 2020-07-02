package patternproblems;

import java.util.Scanner;
public class pat7
{
	private static Scanner sc;
	static void printpattern(int n)
	{  
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
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

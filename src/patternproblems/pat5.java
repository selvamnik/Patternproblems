package patternproblems;

import java.util.Scanner;
public class pat5
{
	private static Scanner sc;
	static void printpattern(int n)
	{    
		for (int i=1;i<=n;i++)
		{
			for(int j=n;j>=i; j--)
			{
				System.out.print(j+ " ");
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

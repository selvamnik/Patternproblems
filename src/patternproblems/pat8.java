package patternproblems;

import java.util.Scanner;
public class pat8
{
	private static Scanner sc;
	static void printpattern(int n)
	{   for(int i=n;i>=1;i--)
		{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j +" ");
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

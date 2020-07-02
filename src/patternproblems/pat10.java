package patternproblems;

import java.util.Scanner;
public class pat10
{
	private static Scanner sc;
	static void printpattern(int n)
	{  
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j +"");
			 }System.out.println();
		 }
		 for(int i=2;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j +"");
			 }System.out.println();
		 }
	}
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        int n=sc.nextInt();
        printpattern(n);
	}

}

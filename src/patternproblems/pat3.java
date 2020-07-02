package patternproblems;

import java.util.Scanner;
public class pat3
{
	private static Scanner sc;
	static void printpattern(int n)
	{    
		int temp =n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
		if (temp == n) {
			for (int i = temp - 1; i > 0; i--) {
				for (int j = 1; j <=i ; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}

	}
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        int n=sc.nextInt();
        printpattern(n);
	}

}

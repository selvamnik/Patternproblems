package patternproblems;

import java.util.Scanner;
public class pat4
{
	private static Scanner sc;
	static void printpattern(int n)
	{    
		int temp =n;
		
		if (temp == n) {
			for (int i = temp; i > 0; i--) {
				for (int j = 1; j <=i ; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
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

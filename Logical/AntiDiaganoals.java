import java.util.*;
public class AntiDiaganoals
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("[");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.println("\n"+"["+a[i][j]+"]");
				}
				else
				{
					System.out.print("["+a[i][j]+"]");
				}
			}
		}
		System.out.println("]");
	}
}

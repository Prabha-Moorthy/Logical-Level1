import java.util.*;
public class CountofWays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row values:");
		int row=sc.nextInt();
		System.out.println("Enter the col values:");
		int col=sc.nextInt();
		System.out.println(countWays(row,col));
	}
	public static int countWays(int n,int m)
	{
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			a[i][0]=1;
		}
		for(int i=0;i<m;i++)
		{
			a[0][i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		return a[n-1][m-1];
	}
}

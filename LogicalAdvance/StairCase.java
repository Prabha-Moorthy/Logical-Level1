import java.util.Scanner;
public class StairCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int N=sc.nextInt();
		int climb=climbStairCase(N);
		System.out.println("The number of ways in staircase climb: "+climb);
	}
	public static int climbStairCase(int N)
	{
		if(N<=1)
		{
			return 1;
		}
		int ways[]=new int[N+1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=N;i++)
		{
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[N];
	}
}

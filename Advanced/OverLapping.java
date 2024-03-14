import java.util.*;
public class OverLapping 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		System.out.println("Enter the value");
		int m=sc.nextInt();
		int interval[][]=new int[n][m];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				interval[i][j]=sc.nextInt();
			}
		}
		mergeOverlapping(interval);
	}
	public static void mergeOverlapping(int interval[][])
	{
		for(int i=0;i<interval.length-1;i++)
		{
			if(interval[i][0]>interval[i+1][0])
			{
				int temp[]=interval[i];
				interval[i]=interval[i+1];
				interval[i+1]=temp;
			}
			if(i>0)
			{
				if(interval[i][0]<interval[i-1][0])
				{
					int temp[]=interval[i];
					interval[i]=interval[i-1];
					interval[i-1]=temp;
					i=0;
				}
			}
		}
		int start=interval[0][0];
		int end=interval[0][1];
		for(int i=1;i<interval.length;i++)
		{
			int currentStart=interval[i][0];
			int currentEnd=interval[i][1];
			if(currentStart<=end)
			{
				end=Math.max(end,currentEnd);
			}
			else
			{
				System.out.println("["+start+","+end+"]");
				start=currentStart;
				end=currentEnd;
			}
		}
		System.out.println("["+start+","+end+"]");
	}
}

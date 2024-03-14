import java.util.*;
public class TwoElementSumclosetozero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int s=a.length;
		int min_sum,min_i,min_j;
		if(s<2)
		{	
			System.out.println("Invalid Input");
			return;
		}
		min_i=0;
		min_j=1;
		min_sum=a[0]+a[1];
		for(int i=0;i<s-1;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				int sum=a[i]+a[j];
				if(Math.abs(min_sum)>Math.abs(sum))
				{
					min_sum=sum;
					min_i=i;
					min_j=j;
				}
			}
		}
		System.out.println("The two element close to zero is: "+a[min_i]+" and "+a[min_j]);
	}
} 

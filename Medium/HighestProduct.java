import java.util.*;
public class HighestProduct
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
		System.out.println(highProduct(a));
	}
	static int highProduct(int a[])
	{
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max1<a[i])
			{	
				max3=max2;
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max3=max2;
				max2=a[i];
			}
			else if(a[i]>max3)
			{
				max3=a[i];
			}
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2)
			{
				min2=a[i];
			}
		}
		return findhigh(min1*min2*max1,max1*max2*max3);
	}
	static int findhigh(int num1,int num2)
	{
		if(num1>num2)
		{
			return num1;
		}	
		return num2;
	}
}

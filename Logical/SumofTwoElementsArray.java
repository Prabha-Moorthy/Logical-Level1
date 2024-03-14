import java.util.Scanner;
public class SumofTwoElementsArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("Enter the target value:");
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==target)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

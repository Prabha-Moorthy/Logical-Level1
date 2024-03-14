import java.util.*;
public class SegregateArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[j++]=a[i];
			}
		}
		while(j<a.length)
		{
			a[j++]=1;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}

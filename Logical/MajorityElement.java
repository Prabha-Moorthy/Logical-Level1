import java.util.*;
public class MajorityElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int majorityElement=findMajority(a);
		if(majorityElement!=Integer.MIN_VALUE)
		{
			System.out.println(majorityElement);
		}
		else
		{
			System.out.println("No majority element is found");
		}
	}
	public static int findMajority(int a[])
	{
		Arrays.sort(a);
		int m=a.length;
		int mid=m/2;
		int value=a[mid];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==value)
			{
				count++;
			}
		}
		if(count>m/2)
		{
			return value;
		}
		else
		{
			return Integer.MIN_VALUE;
		}
	}
}

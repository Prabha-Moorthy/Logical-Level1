import java.util.*;
public class ReverseArray
{
	static int reverse(int a[],int n)
	{
		int t;
		for(int i=0;i<n/2;i++)
		{
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		System.out.println("The reverse array:");
		for(int k=0;k<n;k++)
		{
		System.out.println(a[k]);
		}
		return 1;
	}
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
		reverse(a,a.length);
	}
}

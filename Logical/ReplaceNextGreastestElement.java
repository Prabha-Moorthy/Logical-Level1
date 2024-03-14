import java.util.*;
public class ReplaceNextGreastestElement
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
		int l=a.length;
		int max=a[n-1];
		int temp=0;
		for(int i=n-2;i>=0;i--)
		{
			temp=a[i];
			max=Math.max(max,temp);
			a[i]=max;
		}
		System.out.println("After replacing the elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}

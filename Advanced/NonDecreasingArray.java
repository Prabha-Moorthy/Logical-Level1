import java.util.Scanner;
public class NonDecreasingArray
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
		System.out.println(checkNondecreasing(a));
	}
	public static boolean  checkNondecreasing(int a[])
	{
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				count++;
				if(count>1)
					return false;
				if(i>0 && a[i-1]>a[i+1])
				{
					a[i+1]=a[i];
				}
				else
				{
					a[i]=a[i+1];
				}
			}
		}
		return count<=1;
	}
}

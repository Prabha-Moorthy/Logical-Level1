import java.util.Scanner;
public class MissingNumber
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
		int req=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			sum=sum+a[i];
		}
		int m=req-sum;
		System.out.println("The missing number is: "+m);
	}
}

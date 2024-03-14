import java.util.Scanner;
public class SecondSmallestElement
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]!=min1 && a[i]<min2)
			{
				min2=a[i];
			}
		}
		System.out.println("The second smallest element: "+min2);
	}
}

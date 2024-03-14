import java.util.Scanner;
public class SecondLargestElement
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
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]!=max1 && a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("The second largest element: "+max2);
	}
}

import java.util.Scanner;
public class PairsElement
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
		System.out.println("The sum value");
		int sum=sc.nextInt();
		int low=0;
		int high=a.length-1;
		while(low < high)
		{
			if(a[low]+a[high]>sum)
			{
				high--;
			}
			else if(a[low]+a[high]<sum)
			{	
				low++;
			}
			else if(a[low]+a[high]==sum)
			{
				System.out.println("The Pair("+a[low]+","+a[high]+")");
				low++;
				high--;
			}
		}
	}
}

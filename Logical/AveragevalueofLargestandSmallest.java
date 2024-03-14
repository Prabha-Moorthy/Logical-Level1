import java.util.Scanner;
public class AveragevalueofLargestandSmallest
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{	
			sum=sum+a[i];
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		float avg=(sum-(min+max))/(a.length-2);
		System.out.println("The average value of: "+avg);
	}
}				

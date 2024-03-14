import java.util.*;
public class SmallestElementsArray
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
		findSmallestandSecondSmallest(a);
	}
	public static void findSmallestandSecondSmallest(int num[])
	{
		int smallest =Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++)
		{
			if(num[i] < smallest)
			{
				secondSmallest = smallest;
				smallest = num[i];
			}
			else if(num[i] < secondSmallest && num[i]!= smallest)
			{
				secondSmallest = num[i];
			}
		}
		if(secondSmallest == Integer.MAX_VALUE)
		{
			System.out.println("Array dose not contain two distinct elements");
		}
		else
		{
			System.out.println("Smallest element: "+smallest);
			System.out.println("Second smallest element: "+secondSmallest);
		}
	}
}

import java.util.*;
public class AscendingOrder
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
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		boolean flag=binarySearch(a,target);
		if(flag)
		{
			System.out.println(target+" "+"is found in a list");
		}
		else
		{
			System.out.println(target+" "+"is not found in a list");
		}
	}
	static boolean binarySearch(int a[],int target)
	{
		int left=0;
		int right=a.length-1;
		while(left<right)
		{
			int mid=left+(right-left)/2;
			if(a[mid]==target)
			{
				return true;
			}
			else if(a[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return false;
	}
}

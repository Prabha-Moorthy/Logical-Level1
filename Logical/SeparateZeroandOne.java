import java.util.*;
public class SeparateZeroandOne
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
		int left=0;
		int right=a.length-1;
		while(left<right)
		{
			while(a[left]==0 && left<right)
			{
				left++;
			}
			while(a[right]==1 && left<right)
			{
				right--;
			}
			if(left<right)
			{
				a[left]=0;
				a[right]=1;
				left++;
				right--;
			}
		}
		System.out.println("After Separating");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
} 

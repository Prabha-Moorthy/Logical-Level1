import java.util.*;
public class SortMaxandMinValue
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
		Arrays.sort(a);
		int l=a.length;
		int left=0,right=l-1;
		System.out.println("After Sorting");
		while(left<right)
		{
			System.out.println(a[right--]);
			System.out.println(a[left++]);
			if(left==right)
			{
				System.out.println(a[left]);
			}
		}
	}
}

import java.util.*;
public class SeparateOddandEven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp[]=new int[a.length];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=0;
		int r=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				temp[l]=a[i];
				l++;
			}
			else
			{
				temp[r]=a[i];
				r--;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}

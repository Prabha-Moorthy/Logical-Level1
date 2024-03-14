import java.util.*;
public class EqualityofTwoArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		System.out.println("Enter the value");
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		System.out.println("Enter the 1st Array element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the 2nd Array element:");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		/*boolean flag=Arrays.equals(a,b);
		if(flag==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		*/
		boolean flag=true;
		if(a.length == b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i] != b[i])
				{
					flag=false;
				}
				
			}
		}
		else
		{
			flag=false;
		}
		if(flag==true)
		{
			System.out.println("The Two Arrays are equal");
		}
		else
		{
			System.out.println("The Two Arrays are not equal");
		}
		
	}
	
}

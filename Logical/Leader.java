import java.util.*;
public class Leader
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("Leader element"+a[i]);
			}
		}
	}
}

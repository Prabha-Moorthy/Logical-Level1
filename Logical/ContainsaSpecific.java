import java.util.Scanner;
public class ContainsaSpecific
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
		System.out.println("Enter the Specific element");
		int element=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("The array contains the value"+element);	
		}
		else
		{
			System.out.println("The array not contains the value"+element);
		}
	}
}					

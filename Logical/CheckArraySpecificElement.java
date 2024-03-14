import java.util.Scanner;
public class CheckArraySpecificElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int element1=65;
		int element2=77;
		boolean flag1=false;
		boolean flag2=false;
		for(int i=0;i<a.length;i++)
		{ 	
			if(a[i]==element1)
			{
				flag1=true;
			}
			else if(a[i]==element2)
			{
				flag2=true;
			}
		}
		if(flag1 && flag2)
		{	
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}		

import java.util.Scanner;
public class IndexofArray
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
		System.out.println("Enter the element of in the index");
		int element=sc.nextInt();
		int index=-1;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				index=i;
				break;
			}
		}
		System.out.println("The index of given number is:"+index);
	}
}			

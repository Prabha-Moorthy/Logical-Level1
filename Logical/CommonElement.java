import java.util.*;
public class CommonElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		String a[]=new String[n];
		String b[]=new String[n];
		System.out.println("Enter the frist array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Enter the second array element");
		for(int j=0;j<n;j++)
		{
			b[j]=sc.next();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i].equals(b[j]))
				{
					System.out.println("The common element: "+a[i]);
				}
			}
		}
	}
}		

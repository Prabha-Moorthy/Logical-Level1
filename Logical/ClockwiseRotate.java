import java.util.*;
public class ClockwiseRotate
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elemnets");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int last=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		System.out.println("After rotating");
		a[0]=last;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}	

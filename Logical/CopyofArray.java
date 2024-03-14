import java.util.*;
public class CopyofArray
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
		int b[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("The array:"+Arrays.toString(a));
		System.out.println("The new array:"+Arrays.toString(b));
	}
}

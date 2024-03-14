import java.util.*;
public class RemoveDuplicateElementandReturn
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
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[j]!=a[i])
			{
				j++;
				a[j]=a[i];
			}
		}
		a=Arrays.copyOf(a,j+1);
		System.out.println("After removing duplicate elements: "+a.length);
	}
}	

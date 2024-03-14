import java.util.*;
public class InsertElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vlaue");
		int n=sc.nextInt();
		int a[]=new int[n];
		int res[]=new int[n+1];
		System.out.println("Enter the Element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the insert element:");
		int element=sc.nextInt();
		System.out.println("Enter the index value");
		int index=sc.nextInt();
		for(int i=0;i<a.length+1;i++)
		{
			if(i<index-1)
			{
				res[i]=a[i];
			}
			else if(i==index-1)
			{
				res[i]=element;
			}
			else
			{
				res[i]=a[i-1];
			}
		}
		System.out.println("The Insert element array:"+Arrays.toString(res));
	}
}

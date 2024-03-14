import java.util.*;
public class SortanArray
{
	static int integersort(int a[],int n)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return 1;
	}
	
	static String Stringsort(String a[],int n)
	{
		String temp=" ";
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=1;j<a.length;j++)
			{
			int pos=0;
				while(pos<a[j].length() && pos<a[j-1].length() && Character.toLowerCase(a[j].charAt(pos)) 
							== Character.toLowerCase(a[j-1].charAt(pos)))
				{
				pos++;
				}
				if(pos<a[j].length() && pos<a[j-1].length() && Character.toLowerCase(a[j].charAt(pos)) 
							< Character.toLowerCase(a[j-1].charAt(pos)))
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return " ";
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		String b[]=new String[n];
		System.out.println("Enter the Strings:");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.next();
		}
		integersort(a,n);
		Stringsort(b,n);
	}
}

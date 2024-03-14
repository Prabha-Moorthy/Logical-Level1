import java.util.Scanner;
public class DiffbetweenLargestandSmallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		int diff=max-min;
		System.out.println("The Different between Max and Min:"+diff);
	}
}

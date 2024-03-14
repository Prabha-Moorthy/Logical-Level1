import java.util.Scanner;
public class CheckArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(check(a));
	}
	static boolean check(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0 || a[i]==-1)
			{
				return false;
			}
		}
		return true;
	}
}

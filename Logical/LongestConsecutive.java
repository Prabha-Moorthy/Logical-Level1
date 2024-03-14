import java.util.*;
public class LongestConsecutive
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int longest=1;
		int current=1;
		System.out.println("The length of longest consecutive is ");
		for(int i=1;i<a.length;i++)
		{
			if(a[i] != a[i-1])
			{
				if(a[i] == a[i-1]+1)
				{
					current+=1;
				}
				else
				{
					longest=Math.max(longest,current);
					current=1;
				}
			}
		}
		System.out.println(Math.max(longest,current));
	}
}

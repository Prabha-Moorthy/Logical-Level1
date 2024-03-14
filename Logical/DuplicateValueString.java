import java.util.*;
public class DuplicateValueString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		boolean visit[]=new boolean[n];
		for(int i=0;i<a.length;i++)
		{
			if(!visit[i])
			{
				boolean Duplicate=false;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i].equals(a[j]))
					{
						Duplicate=true;
						visit[j]=true;
					}
				}
				if(Duplicate)
				{
					System.out.println("The Duplicate String: "+a[i]);
				}
			}
		}
	}
} 

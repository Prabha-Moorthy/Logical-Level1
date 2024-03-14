import java.util.Scanner;
public class CommonElementThreearray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the M value");
		int m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter the O value");
		int o=sc.nextInt();
		int c[]=new int[o];
		System.out.println("Enter the N elements;");
		for(int i=0;i<n;i++)
		{ 
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the M elements;");
		for(int i=0;i<m;i++)
		{ 
			b[i]=sc.nextInt();
		}
		System.out.println("Enter the O elements;");
		for(int i=0;i<o;i++)
		{ 
			c[i]=sc.nextInt();
		}
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length && k<c.length)
		{
			if(a[i]==b[j] && b[j]==c[k] && a[i]==c[k])
			{
				System.out.println("The Common Element is:"+a[i]);
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else if(b[j]<c[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
	}
}

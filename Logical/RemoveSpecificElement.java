import java.util.*;
public class RemoveSpecificElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the removing element");
		int remove=sc.nextInt();
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(remove==a[i])
			{
				index=i;
			}
		}
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a=Arrays.copyOf(a,a.length-1);
		System.out.println("After removing the element:"+Arrays.toString(a));
	}
}		 

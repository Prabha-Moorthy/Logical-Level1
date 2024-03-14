import java.util.Scanner;
public class ProductofAllnumbersinArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int res[]=new int[n];
		int leftProducts[]=new int[n];
		int rightProducts[]=new int[n];
		int leftProduct=1;
		for(int i=0;i<a.length;i++)
		{
			leftProducts[i]=leftProduct;
			leftProduct*=a[i];
		}
		int rightProduct=1;
		for(int i=a.length-1;i>=0;i--)
		{
			rightProducts[i]=rightProduct;
			rightProduct*=a[i];
		}
		System.out.println("Product of all numbers in array:");
		for(int i=0;i<a.length;i++)
		{
			res[i]=leftProducts[i]*rightProducts[i];
			System.out.println(res[i]);
		}
	}
}

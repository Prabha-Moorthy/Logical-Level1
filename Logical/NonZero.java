import java.util.Scanner;
public class NonZero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int len=arr.length;
		int count=0;
		System.out.println("Enter the element");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		System.out.println("The NonZero Array");
		while(count < len)
		{
			arr[count++]=0;
		}
		for(int j=0;j<len;j++)
		{
			System.out.println(arr[j]);
		}
	}
}

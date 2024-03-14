import java.util.Scanner;
public class PartitionSubset
{
	public static void main(String arg[])
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
		//int num[]={15,5,20,10,35,25};
		System.out.println(canPartition(a));
	}
	public static boolean canPartition(int n[])
	{
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		if(sum%2!=0)
			return false;
			int targetSum=sum/2;
			return canPartitionRecursive(n,0,targetSum);
	}
	public static boolean canPartitionRecursive(int n[],int index,int targetSum)
	{
		if(targetSum==0)
		{
			return true;
		}
		if(index==n.length || targetSum<0)
		{
			return false;
		}
		return canPartitionRecursive(n,index+1,targetSum-n[index]) ||
						canPartitionRecursive(n,index+1,targetSum);
	}
}

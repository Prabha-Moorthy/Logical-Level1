import java.util.*;
public class Perfect
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int num=sc.nextInt();
		int n=1;
		System.out.println("The first perfect number is:"+findNthPerfectNum(n,num));
		n=2;
		System.out.println("The second perfect number is:"+findNthPerfectNum(n,num));
	}
	public static boolean isPerfectNumber(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum==10;
	}
	public static int findNthPerfectNum(int n,int num)
	{
		int count=0;
		//int num=37;
		while(count < n)
		{
			if(isPerfectNumber(num))
			{
				count++;
			}
			num++;
		}
		return num-1;
	}
}

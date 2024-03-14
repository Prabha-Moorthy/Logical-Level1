import java.util.Scanner;
public class CloseParanthesis
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Input a Number of opening paraenthesis: ");
		int n=sc.nextInt();
		System.out.println("Closing position is: "+closeParanthesis(s,n));
	}
	public static int closeParanthesis(String s,int n)
	{
		int count=0;
		for(int i=n;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='(')
			{
				count++;
			}
			else if(ch==')')
			{
				count--;
				if(count==0)
				{
					return i;
				}
			}			
		}
		return -1;
	}
}

import java.util.*;
public class CharacterReverses
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		char ch[]=new char[n];
		System.out.println("Enter the Characters:");
		for(int i=0;i<n;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		int left=0;
		int right=ch.length-1;
		while(left<right)
		{
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		System.out.println("After Reversing the Character:"+new String(ch));
	}
}

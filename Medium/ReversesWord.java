import java.util.*;
public class ReversesWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		char ch[]=new char[n];
		sc.nextLine();
		System.out.println("Enter the Charaters:");
		for(int i=0;i<n;i++)
		{
			ch[i]=sc.nextLine().charAt(0);
		}
		System.out.println(Arrays.toString(ch));
		//char ch[]={'I',' ','l','i','k','e',' ','j','a','v','a'};
		reverseWord(ch);
		System.out.println("After Reversing Word: "+new String(ch));
	}
	static void reverseCharacter(char ch[],int left,int right)
	{
		while(left<right)
		{
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	}
	static void reverseWord(char ch[])
	{
		reverseCharacter(ch,0,ch.length-1);
		int start=0;
		for(int end=0;end<ch.length;end++)
		{
			if(ch[end]==' ')
			{
				reverseCharacter(ch,start,end-1);
				start=end+1;
			}
			else if(end==ch.length-1)
			{
				reverseCharacter(ch,start,end);
			}
		}
	}
}

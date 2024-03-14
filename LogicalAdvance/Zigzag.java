import java.util.*;
public class Zigzag
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the Rows");
		int rows=sc.nextInt();
		printZigzag(s,rows);
	}	
	public static void printZigzag(String s,int rows)
	{
		if(rows<=0)
		{
			System.out.println("Invalid Rows");
			return;
		}
		if(rows==1 || s.length()<=rows)
		{
			System.out.println(s);
			return;
		}
		char zigzag[][]=new char[rows][s.length()];
		int row=0;
		boolean down=true;
		for(int i=0;i<s.length();i++)
		{
			zigzag[row][i]=s.charAt(i);
			if(down)
			{
				row++;
				if(row==rows-1)
				down=false;
			}
			else
			{
				row--;
				if(row==0)
				down=true;
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<s.length();j++)
			{	
				System.out.print(zigzag[i][j]==0?" ":zigzag[i][j]);
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class WordTwoDMatrix
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char matrix[][]={{'F','A','C','I'},
		          	{'O','B','Q','P'},
		           	{'A','N','O','B'},
		            	{'M','A','S','S'}};
		System.out.println("Enter the String:");
		String s=sc.next().toUpperCase();
		int row=matrix.length;
		int col=matrix[0].length;
		boolean flag=false;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j+s.length() <= col)
				{      
					StringBuilder horizontal=new StringBuilder();
					for(int k=0;k<s.length();k++)
					{
						horizontal.append(matrix[i][j+k]);
					}
					if(horizontal.toString().equals(s))
						flag=true;	
				}
				if(i+s.length() <= row)
				{   
					StringBuilder vertical=new StringBuilder();
					for(int k=0;k<s.length();k++)
					{
						vertical.append(matrix[i+k][j]);
					}
					if(vertical.toString().equals(s))
						flag=true;	
				}
			
			}
		
		}
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
	}

}

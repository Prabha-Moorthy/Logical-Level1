import java.util.Scanner;
public class MatrixAddition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row value:");
		int row=sc.nextInt();
		System.out.println("Enter the col value:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		System.out.println("First Row and Coloum:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second Row and Coloum:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The Addition of matrix: ");
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(c[i][j]);
			}
		}
	}
}

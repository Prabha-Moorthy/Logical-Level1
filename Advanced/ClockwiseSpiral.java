import java.util.Scanner;
public class ClockwiseSpiral
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value");
		int row=sc.nextInt();
		System.out.println("Enter the col value");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int rowstart=0;
		int rowend=a.length;
		int colstart=0;
		int colend=a[0].length;
		System.out.println("After making a Spiral");
		while(rowstart<rowend && colstart<colend)
		{
			for(int i=colstart;i<colend;i++)
			{
				System.out.println(a[rowstart][i]+" ");
			}
			rowstart++;
			for(int i=rowstart;i<rowend;i++)
			{
				System.out.println(a[i][colend-1]);
			}
			colend--;
			for(int i=colend-1;i>=colstart;i--)
			{
				System.out.println(a[rowend-1][i]);
			}
			rowend--;
			for(int i=rowend-1;i>=rowstart;i--)
			{
				System.out.println(a[i][colstart]);
			}
			colstart++;
		}
	}
}

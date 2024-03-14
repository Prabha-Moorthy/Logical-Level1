import java.util.Scanner;
public class Parathesis
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String expression=sc.next();
		//String expression="{[()]}";
		boolean flag=flagExpression(expression);
		System.out.println(flag);
	}
	public static boolean flagExpression(String expression)
	{
		int countCurly=0,countSquare=0,countRound=0;
		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='{')
			{
				countCurly++;
			}
			else if(expression.charAt(i)=='}')
			{
				countCurly--;
			}
			else if(expression.charAt(i)=='[')
			{
				countSquare++;
			}
			else if(expression.charAt(i)==']')
			{
				countSquare--;
			}
			else if(expression.charAt(i)=='(')
			{
				countRound++;
			}
			else if(expression.charAt(i)==')')
			{
				countRound--;
			}
			else if(Character.isAlphabetic(expression.charAt(i)))
		}
		return countCurly==0 && countSquare==0 && countRound==0;
	}
}

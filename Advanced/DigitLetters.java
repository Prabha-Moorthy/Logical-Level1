import java.util.*;
public class DigitLetters
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String digits=sc.nextLine();
		//String digits="73";
		String result[]=letterCombination(digits);
		System.out.println("The combinations are:");
		for(String combination:result)
		{
			System.out.print(combination+" ");
		}
	}
	public static String[] letterCombination(String digits)
	{
		if(digits == null || digits.length()==0)
			return new String[0];
		String mapping[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String[] result={""};
		for(int i=0;i<digits.length();i++)
		{
			int digit=Character.getNumericValue(digits.charAt(i));
			String[] temp=new String[result.length*mapping[digit].length()];
			int index=0;
			for(String combination:result)
			{
				String letter=mapping[digit];
				for(int j=0;j<letter.length();j++)
				{
					temp[index++]=combination + letter.charAt(j);
				}
			}
			result=temp;
		}
		return result;
	}
}

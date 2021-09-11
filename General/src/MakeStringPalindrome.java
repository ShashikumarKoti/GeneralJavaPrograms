import java.util.Stack;

public class MakeStringPalindrome 
{
	public static void main(String [] args)
	{
		String s = "akkada";
		if(isPalin(s))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome, lets convert now");
			 convertToPalin(s);			
		}
	}
	static boolean isPalin(String str)
	{
		if(str==null)
		{
			return false;
		}
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
	static void convertToPalin(String str)
	{		
		char index = str.charAt(0);
		Stack<Character> s = new Stack<Character>();
		s.push(index);	
		String remainSubString = str.substring(1);
		boolean x = isPalin(remainSubString);
		if(x)
		{
			System.out.println("Converted to palin");
		}
		else
		{			
			convertToPalin(remainSubString);			
		}
		System.out.print(s.peek());	
		
	}
}

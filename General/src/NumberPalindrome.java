
public class NumberPalindrome 
{
	public static void main(String [] args)
	{
		int number = 121;
		boolean isPalin = palin(number);
		System.out.println(number+" is Palindrome "+isPalin);				
	}
	static boolean palin(int num)
	{
		int orig = num, result = 0;
		while(num>0)
		{
		int rem = num%10;
		result = rem + (result * 10);
		num = num/10;
		}
		if(result == orig)
			return true;
		else
		return false;
	}
}

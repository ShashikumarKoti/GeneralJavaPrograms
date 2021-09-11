
public class Armstrong
{
	public static void main(String [] args)
	{
		int number = 153;
		boolean isArmstrong = armstrong(number);
		System.out.println(isArmstrong);
	}
	static boolean armstrong(int num)
	{
		int orig = num, result = 0;
		while(num>0)
		{
			int rem = num%10;
			result = result +(rem * rem * rem);
			num = num/10;
		}
		if(result == orig)
			return true;
		else
			return false;
	}
}

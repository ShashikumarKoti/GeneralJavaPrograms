
public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int i = 123;
		int x = reverseNumber(i);
		System.out.println(x);
	}
	static int reverseNumber(int num)
	{
		int sum =0;
		while(num>0)
		{
			int rem = num%10;
			sum = rem + (sum * 10);
			num = num/10;
		}
		return sum;
	}

}

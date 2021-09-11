
public class SumOfDigits 
{
	public static void main(String [] args)
	{
		int number = 143, sum = 0;
		int orig = number;
		while(number>0)
		{
			int rem = number%10;
			sum = sum + rem;
			number = number/10;
		}
		System.out.println("Sum of digits of "+orig+" is "+sum);
	}
}

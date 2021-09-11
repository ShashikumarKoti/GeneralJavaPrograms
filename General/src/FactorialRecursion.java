
public class FactorialRecursion
{
	static int factorial(int num)
	{
		if(num == 0||num==1)
			return 1;
		 return num * factorial(num-1);
	}

	public static void main(String [] args)
	{
		int number = 5;
		int result = factorial(number);
		System.out.println("Factorial of "+number+" is "+result);
	}
}

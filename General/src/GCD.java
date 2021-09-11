
public class GCD 
{
	public static void main(String [] args)
	{
		int number1 = 3,number2 = 6;
		int gcd = findGCD(number1,number2);
		System.out.println("GCD of "+number1+" and "+number2+" is "+gcd);
	}
	static int findGCD(int num1, int num2)
	{
		if(num2 == 0)
		{
			return num1;
		}
		return findGCD(num2,num1%num2);
	}
}

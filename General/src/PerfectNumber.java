/*
 * Perfect number is a positive integer that is equal to the sum of its positive divisors excluding the number itself.
 * 	Example-
	6= 1+2+3
	28= 1+2+4+7+14
	496= 1+2+4+8+16+31+62+124+248
 */
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int num = 28;
		System.out.println((isPerfectNumber(num)==true)? num+" is Perfect number": num+" is NOT perfect");
	}
	
	static boolean isPerfectNumber(int num)
	{
		int sumOfDivisors = 1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				sumOfDivisors += i;
			}
			else
			{}
		}
		if(sumOfDivisors==num)
			return true;
		else
			return false;
	}

}

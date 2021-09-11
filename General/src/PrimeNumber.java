
public class PrimeNumber
{
	public static void main(String [] args)
	{
		int number = 19, temp = 0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				System.out.println(number+" is Not prime number");
				temp = 1;
				break;
			}
		}
		if(temp ==0)
		{
			System.out.println(number+" is a Prime number");
		}
	}
}

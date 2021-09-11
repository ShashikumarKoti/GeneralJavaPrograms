
public class FactorialLoop
{
	public static void main(String [] args)
	{
		int number = 5,result = 1;
		for(int i=number;i>=1;i--)
		{		
			result = result * i;			
		}
		System.out.println(result);		
	}
}

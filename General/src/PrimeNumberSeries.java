
public class PrimeNumberSeries
{
	public static void main(String [] args)
	{
		int series = 23; 
		for(int i=2;i<=series;i++)
		{
			int temp = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp =1;
					break;
				}
			}
			if(temp ==0)
			{
				System.out.print(" "+ i);
			}
		}
	}
}

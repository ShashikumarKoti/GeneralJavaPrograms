import java.util.ArrayList;

public class EvenOddSeries 
{
	public static void main(String [] args)
	{
		int number = 10;
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i=0;i<=number;i++)
		{
			if(i%2==0)
			{
				even.add(i);
			}
			else
				odd.add(i);
		}
		System.out.println("Even numbers are: "+even);
		System.out.println("Odd numbers are: "+odd);
	}
}

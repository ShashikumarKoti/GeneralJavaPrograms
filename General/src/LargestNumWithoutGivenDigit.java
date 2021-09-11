
public class LargestNumWithoutGivenDigit 
{
	public static void main(String [] args)
	{
		int x = getLessThan(129,2);
		System.out.println(x);
	}
	
	static int getLessThan(int number, int digit)
	{
		//Converting digit to char
		char c = Integer.toString(digit).charAt(0);
		System.out.println(c);
		/*int cc = Integer.toString(129).indexOf(c);
		System.out.println(cc);*/
		//Decrementing number & checking whether it contains digit
		for(int i= number;i>=0;i--)
		{
			if(Integer.toString(i).indexOf(c)== -1)
			{
				return i;
			}
		}
		return -1;
	}
}


public class BinaryOrNot 
{
	public static void main(String [] args)
	{
		System.out.println("101 is a binary number "+ isBinary(101));
		System.out.println("101 is a binary number "+ isBinary(1231));
		System.out.println("101 is a binary number "+ isBinary(1100));
		System.out.println("101 is a binary number "+ isBinary(1397));
	//Type-1
		int number = 122;
		int x = number&1;
		if(x==1)
		{
			System.out.println("Odds");
		}else
			System.out.println("Evens");
	}
	//Type-2
	static boolean isBinary(int num)
	{
		int copy = num;
		while(copy != 0)
		{
			if(copy%10 >1)
			{
				return false;
			}
			copy = copy/10;
		}
		return true;
	}
}

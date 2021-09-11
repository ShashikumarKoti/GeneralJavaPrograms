
public class BinaryToDecimal
{
	public static void main(String[] args)
	{
		//Type-1 //Note: here the variable is of String type
		String binary = "1110";
		System.out.println(Integer.parseUnsignedInt(binary,2));
		
		//Type-2
		int bin = 1110;
		int decimal = convertToDecimal(bin);
		System.out.println("Decimal of "+bin+" is "+decimal);
	}
	static int convertToDecimal(int bin)
	{
		int decimal = 0, power = 0;
		while(bin>0)
		{
			decimal += (bin%10)*Math.pow(2, power++);
			bin = bin/10;				
		}
		return decimal;
	}
}

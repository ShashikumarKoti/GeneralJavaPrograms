	
public class DecimalToBinary 
{
	
	public static void main(String [] args)
	{			
		int number = 15;
		//Type-1
	//	System.out.println(Integer.toBinaryString(number));
//IMPORTANT	//Type-2
		String binary = "";
		while(number>0)
		{
			binary = number%2 + binary;
			number = number/2;
		}
		System.out.println("Binary of "+number+" is "+binary);
	}
}

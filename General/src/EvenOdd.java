
public class EvenOdd 
{
	public static void main(String [] args)
	{
		int number = 101;
		//Type-1
		if(number%2==0)
		{
			System.out.println(number+" is a even number");
		}
		else
			System.out.println(number+" is a odd number");
		
		//Type-2
		int result = number;
		while(result>=2)
		{
			result = result-2; 
		}
		if(result==1)
		{
			System.out.println(number+" is a ODD number");
		}
		else
			System.out.println(number+" is a EVEN number");
//IMPORTANT		//Type-3  
		if((number&1)==0)
		{
			System.out.println("EVEN");
		}
		else
			System.out.println("ODD");
	}
}

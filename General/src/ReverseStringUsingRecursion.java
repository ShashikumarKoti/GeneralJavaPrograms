
public class ReverseStringUsingRecursion 
{
	public static void main(String [] args)
	{
		String str = "hello";
		String reversedString = recursiveReverse(str);
		System.out.println(reversedString);
	}
	static String recursiveReverse(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		return recursiveReverse(str.substring(1))+ str.charAt(0);
	}
}

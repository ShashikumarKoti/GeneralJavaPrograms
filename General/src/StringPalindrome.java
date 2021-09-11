
public class StringPalindrome 
{
	public static void main(String [] args)
	{
		String str = "malayalam";
		boolean isPalin = palin(str);
		System.out.println(str+" is Palin ? "+isPalin);
	}
	static boolean palin(String string)
	{
		int length = string.length();
		if(string == null ||string.length()==0)
			return false;
		if(string.length()==1)
			return true;
		for(int i=0;i<length;i++)
		{
			if(string.charAt(i)!=string.charAt(length-i-1))
			{
				return false;
			}			
		}
		return true;
	}
}

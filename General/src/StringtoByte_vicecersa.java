import java.util.Arrays;


public class StringtoByte_vicecersa
{
	public static void main(String[] args)
	{
		String str= "www.journaldev.com";		
		//String to byte array
		byte [] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		//byte array to string
		String s = new String(bytes);
		System.out.println(s);
		System.out.println(str == s);
		System.out.println(str.equals(s));
	}
}

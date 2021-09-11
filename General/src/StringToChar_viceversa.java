import java.util.Arrays;


public class StringToChar_viceversa
{
	public static void main(String[] args) 
	{
		String str = "shashi";
		char [] c = str.toCharArray();
		//String to char array
		System.out.println(Arrays.toString(c));
		//char array to String
		System.out.println(String.valueOf(c));
		//String to char
		char c1 = str.charAt(0);
		System.out.println(c1);
		//char to String
		String s = Character.toString(c1);
		System.out.println(s);
	}
	
}

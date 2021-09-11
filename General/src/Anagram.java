import java.util.Arrays;


public class Anagram 
{
	public static void main(String [] args)
	{
		String s1 = "motherinlaw";
		String s2 = "hilterwoman";
		
		if(isAnagram(s1,s2))
		{
			System.out.println(s1+" is Anagram of "+s2);
		}
		else
		{
			System.out.println("String are not anagram");
		}
	}
	static boolean isAnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length()){
			return false;
		}
		str1 = sortChars(str1);
		str2 = sortChars(str2);
		return str1.equals(str2);		
	}
	static String sortChars(String str)
	{
		char [] chars = str.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
	}
}

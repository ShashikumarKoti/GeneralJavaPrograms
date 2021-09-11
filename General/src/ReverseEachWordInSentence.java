
public class ReverseEachWordInSentence
{
	public static void main(String [] args)
	{
		String str = "I am a Java developer";
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			reverse(words[i]);
			System.out.print(" ");
		}
	}
	static void reverse(String strArray)
	{
		for(int j=strArray.length()-1;j>=0;j--)
		{
			System.out.print(strArray.charAt(j));
		}
	}
}

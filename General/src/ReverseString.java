
public class ReverseString
{
	public static void main(String [] args)
	{
		String str = "qwerty";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("Using stringBuffer");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}

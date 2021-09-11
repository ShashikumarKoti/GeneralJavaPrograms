
public class StringToInteger_viceversa
{
	public static void main(String[] args)
	{
		//String to Integer
		String s1 = "123";
		String s2 = "000001230000";
		String s3 = "5432";
		//Type-1
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		System.out.println(i1);
		System.out.println(i2);
		//Type-2
		int i3 = Integer.valueOf(s3);
		System.out.println(i3);
		
		//Integer to String
		int i = 123;
		String s = ""+i;
		//internally it stores like below statement
		//new StringBuilder().append("").append(10).toString();
		System.out.println(s);
	}
}

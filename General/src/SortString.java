import java.util.Arrays;


public class SortString 
{
	public static void main(String [] args)
	{
		String str = "dcabezyb";
		//Type-1		
		char temp = 0;
		char [] chars = str.toCharArray();
		Arrays.sort(chars); //API
		System.out.println(chars);
		
		//Type-2
		for(int i=0;i<chars.length;i++) //Loop
		{
			for(int j=0;j<chars.length;j++)
			{
				if(chars[j]>chars[i])
				{
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		for(int k=0;k<chars.length;k++)
		{
			System.out.print(chars[k]);
		}
	}
}

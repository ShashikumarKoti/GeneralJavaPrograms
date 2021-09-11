
public class CountVowels
{
	public static void main(String [] args)
	{
		String str = "aeiou";
		char [] charArray = str.toCharArray();
		int vowel = 0,consonant=0;
		for(char c : charArray)
		{	
			//Type-1
			/*switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
			default:
			}*/
			
			//Type-2
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowel++;
			}
			else
				consonant++;
		}
		System.out.println("No of vowels: "+vowel);
		System.out.println("No of consonant: "+consonant);
	}
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersinString
{
	public static void main(String [] args)
	{
		String str = "programming";
		findDuplicate(str);
	}
	static void findDuplicate(String word)
	{
		char[] characters = word.toCharArray();
		Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		for(Character c: characters)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
		Set<Map.Entry<Character,Integer>> set = hm.entrySet();
		System.out.println("List of duplicate characters in "+word);
		for(Map.Entry<Character,Integer> entry : set)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}		
	}
}

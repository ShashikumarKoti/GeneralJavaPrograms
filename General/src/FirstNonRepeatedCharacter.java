import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharacter
{
	public static void main(String [] args)
	{
		String str = "pprogrammoing";
		printFirstNonRepeatedChar(str);
	}
	static void printFirstNonRepeatedChar(String str)
	{
		char [] characters = str.toCharArray();
		Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		for(Character c: characters)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}else{
				hm.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> set = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : set)
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
				break;
			}
			continue;
		}
	}
}

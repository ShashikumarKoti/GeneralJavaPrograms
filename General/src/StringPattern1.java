import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringPattern1
{
	public static void main(String [] args)
	{
		String str = "aabcdddeffghh";
		findPattern(str);
		
	}
	static void findPattern(String str)
	{
		char [] characters = str.toCharArray();
		Map<Character,Integer> hm = new LinkedHashMap<Character, Integer>();
		for(Character c: characters)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> set = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : set )			
		{			
			StringBuilder temp1 = new StringBuilder();
			StringBuilder temp2 = new StringBuilder();
			if(entry.getValue()>1)
			{		
				Character key = entry.getKey();
				Integer value = entry.getValue();
				temp1.append(key).append(value);				
			}
			else
			{				
				 Character key = entry.getKey();					
				temp2.append(key).append("");
			}
			System.out.print(temp1.toString()+temp2.toString());
			/*TreeSet<Object> tree = new TreeSet<Object>();
			tree.add(temp1);
			tree.add(temp2);
			System.out.print(tree.toString());*/
		}		
	}	
}

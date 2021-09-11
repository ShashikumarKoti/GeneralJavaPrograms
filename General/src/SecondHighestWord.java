import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondHighestWord {

	public static void main(String[] args) {
		String str = "this is small this ok small this";
		
		String[] split = str.split(" ");
		
		HashMap<String, Integer> hmap = new HashMap<>();
		for(String words : split) {
			if(hmap.containsKey(words)) {
				hmap.put(words, hmap.get(words)+1);
			}
			else {
				hmap.put(words, 1);
			}
		}
			
			int firstMax =0;
			int secondMax=0;
			String firstMAxString = "";
			String secondMaxString = "";
		 Set<Entry<String, Integer>> entrySet = hmap.entrySet();
		 for(Map.Entry<String, Integer> entry : entrySet) {
			 	if(entry.getValue()>firstMax) {
			 		secondMax = firstMax;
			 		firstMax = entry.getValue();
			 		secondMaxString = firstMAxString;
			 		firstMAxString = entry.getKey();
			 	}
		 }
		 System.out.println(secondMaxString);
	}

}
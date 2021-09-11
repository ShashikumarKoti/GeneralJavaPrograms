import java.util.HashMap;
import java.util.Map;

public class CanMakeAPalindrome {

	public static void main(String[] args) {

		String word = "yaakk";
		
		 boolean checkPalindrome = checkPalindrome(word);
		 System.out.println(checkPalindrome);
	}

	private static boolean checkPalindrome(String word) {
		boolean hasOdd = false;
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : word.toCharArray()) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+ 1);
			}
			else {
			map.put(c, 1);
			}
			
		}
		
		System.out.println("Values:" + map.values());
		
		for(int count : map.values()) {
			if(count % 2 == 1) {
				if(hasOdd) {
					return false;
				}
				hasOdd =  true;
			}
		}
		return hasOdd;
	}


}

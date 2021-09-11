import java.util.HashSet;
import java.util.Set;

public class PermutationOfString
{   
    public static void main (String args[])
    {
        String s = "ABC";
        System.out.println("Permutations of "+s+" are "+ permute(s));
    }
    static Set<String> permute(String str)
    {
    	Set<String> result = new HashSet<String>();
    	if(str == null){
    		return null;
    	}else if(str.length()== 0)
    	{
    		result.add("");
    		return result;
    	}
    	char firstChar = str.charAt(0);
    	String remainingSubString = str.substring(1);
    	Set<String> words = permute(remainingSubString);
    	for(String newString : words)
    	{
    		for(int i=0;i<=newString.length();i++)
    		{
    			result.add(addChar(newString, firstChar,i));
    		}
    	}
    	return result;
    }
    	
    	static String addChar(String string, char c,int j)
    	{
    		String first = string.substring(0,j);
    		String last = string.substring(j);
    		return first + c + last;
    	}    
}
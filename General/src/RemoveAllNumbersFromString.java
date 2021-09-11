
public class RemoveAllNumbersFromString 
{
	public static void main(String[] args)
	{
		  String str = "Ins99tance12ofjava143";
		  String[] split = str.split("[A-Z]");
		  for(String word: split) {
			  System.out.println(word);
		  }
//		  str = str.replaceAll("[0-9]", "");
//		  System.out.println(str);
//		  
//		  //Remove all occurrences of a string  
//		  String s1 = "Hello World";
//		  s1 = s1.replaceAll("o", "");
//		  System.out.println(s1);
//		  //Replace First occurrence of Specific index char in a String
//		  String s = "Java";
//		  String result = s.substring(0,1)+ s.substring(1+1);
//		  System.out.println(result);
//		  //Remove multiple spaces in string
//		  String s2 = "Instance of java";
//		  s2 = s2.replaceAll(" ", "");
//		  System.out.println(s2);
		 
	}
}


public class PermutationOfString2
{
	 public static void main (String args[])
	 {
		 String s = "java";
		 permute("", s);
	 }
	 static void permute(String beginningString, String endString)
	 {
		 if(endString.length()<=1)
		 {
			 System.out.println(beginningString+endString);
		 }
		 else{
			 for(int i=0;i<endString.length();i++)
			 {				 
				 String newString = endString.substring(0,i)+endString.substring(i+1);
				 permute(beginningString+endString.charAt(i), newString);				 
			 }
		 }
	 }
}

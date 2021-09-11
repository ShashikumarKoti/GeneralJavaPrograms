
public class ReverseStringWithPreservingPositions
{
	public static void main(String[] args)
	{
		reverseString("I Am Not String");
	}
	static void reverseString(String inputString)
	{
		char inputStringArray [] = inputString.toCharArray();
		char resultArray[] = new char[inputStringArray.length];
		//For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions
		for(int i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i]==' ')
			{
				resultArray[i]=' ';
			}
		}
		//we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
		int j = inputStringArray.length - 1;
		for(int y=0;y<inputStringArray.length;y++)
		{
			if(inputStringArray[y] != ' ')
			{
				if(resultArray[j] == ' ')
				{
					j--;
				}
				resultArray[j] = inputStringArray[y];
				j--;
			}	
		}
		System.out.println(inputString+"--->"+String.valueOf(resultArray));
	}
}

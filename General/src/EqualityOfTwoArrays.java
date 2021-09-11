import java.util.Arrays;

public class EqualityOfTwoArrays 
{
	public static void main(String [] args)
	{
		int arrayOne[] = {1,2,3,4};
		int arrayTwo[] = {1,2,3,4};
		//Type-1
		System.out.println(Arrays.equals(arrayOne, arrayTwo));
		
		//Type-2
		boolean isEqual = true;
		if(arrayOne.length == arrayTwo.length)
		{
			for(int i=0;i<arrayOne.length;i++)
			{
				if(arrayOne[i]!=arrayTwo[i])
				{
					isEqual = false;
				}
			}
		}
		else{
			isEqual = false;
		}
		if(isEqual)
		{
			System.out.println("Arrays are equal");
		}
		else{
			System.out.println("Not equal");
		}
		//Type-3 for multidimensional arrays (use Arrays.deepEquals() method)
		int array1 [][] = {{1,2,3,4},{'a','b','c','d'}};
		int array2 [][] = {{1,2,3,4},{'a','b','c','d'}};
		
		System.out.println("For multi dimensional arrays use Arrays.deepEquals()");
		System.out.println(Arrays.deepEquals(array1, array2));
		System.out.println(Arrays.equals(array1, array2));
	}
}

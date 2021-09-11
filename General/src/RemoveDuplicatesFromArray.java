import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesFromArray
{
	public static void main(String [] args)
	{
		int arr[] = {1,2,3,2,2,8,4,5,2,5};
		int length = arr.length;
		//Type-1
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j] = arr[length-1];
					length--;
					j--;
				}
			}
		}		
		int[] withoutDuplicates = Arrays.copyOf(arr, length);
		for(int i=0;i<withoutDuplicates.length;i++)
		{
			System.out.print(withoutDuplicates[i]+" ");
		}
		//Type-2 (Using API)
		System.out.println(" ");
		Set<Integer> set = new LinkedHashSet<Integer>();
		for( int j=0;j<arr.length;j++)
		{
			set.add(arr[j]);
		}
		Object [] withoutDuplicate = set.toArray();
		for(int i=0;i<withoutDuplicate.length;i++)
		{
			System.out.print(withoutDuplicate[i] + " ");
		}
	}
}

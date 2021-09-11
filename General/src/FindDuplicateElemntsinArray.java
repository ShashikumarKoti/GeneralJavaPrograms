import java.util.HashSet;


public class FindDuplicateElemntsinArray
{
	public static void main(String [] args)
	{
		int arr [] = {1,2,3,2,2,8,4,5,2,5};
		int len = arr.length;
		//Type-1
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j] && (i!=j))
				{
					System.out.println("Duplicate element is: "+arr[i]);					
				}
			}
		}
		//Type-2 (Using API)
		System.out.println("Type-2");
		HashSet<Integer> set = new HashSet<Integer>();
		for(int x :arr)
		{
			if(!set.add(x))
			{
				System.out.println("Duplicate element is: "+x);				
			}
		}
	}
}

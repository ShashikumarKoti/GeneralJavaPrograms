import java.util.ArrayList;
import java.util.List;


public class DuplicateNumbersinList 
{
	public static void main(String[] args)
	{
		List<Integer> ll= new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			ll.add(i);
		}
		ll.add(5);
		ll.add(3);		
		
		findDuplicates(ll);
	}
	
	static void findDuplicates(List<Integer> list)
	{
		List<Integer> duplicates = new ArrayList<Integer>();
		System.out.println("Original list is: "+list);
		System.out.println("Duplicates in list are: ");
		for(int i: list)
		{
			if(duplicates.contains(i))
			{
				System.out.print(i+" ");
			}
			else
				duplicates.add(i);
		}
		
	}

}

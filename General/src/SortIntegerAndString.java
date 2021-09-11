import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerAndString
{
	public static void main(String[] args)
	{
		List<Object> ll = new ArrayList<Object>();
		ll.add('b');
		ll.add('a');
		ll.add(5);
		ll.add(7);
		ll.add(1);
		ll.add('m');
		ll.add('x');
		System.out.println("Original list: "+ll);
		sortList(ll);
		System.out.println("Sorted list: Type-2 output: "+ ll);
	}
	static void sortList(List<Object> list)
	{
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<Character> strList  = new ArrayList<Character>();
		for(Object obj : list)
		{
			if(obj instanceof Integer)
			{
				intList.add((Integer)obj);
			}
			else if(obj instanceof Character)
			{
				strList.add((Character)obj);				
			}		
		}
		
		Collections.sort(intList);
		Collections.sort(strList);
		//Type-1
	 	ArrayList<Object> combinedList = new ArrayList<Object>();
	//	combinedList.addAll(intList);
		combinedList.addAll(strList);
		combinedList.addAll(intList);
		System.out.println("Sorted list: Type-1 output: "+combinedList);
		
		//Type-2
		int intIndex = 0,strIndex = 0;
		for(int i =0;i<list.size();i++)
		{
			if(list.get(i) instanceof Integer)
			{
				list.set(i , intList.get(intIndex++));
			}
			if(list.get(i) instanceof Character)
			{
				list.set(i, strList.get(strIndex++));
			}
		}
	}
}

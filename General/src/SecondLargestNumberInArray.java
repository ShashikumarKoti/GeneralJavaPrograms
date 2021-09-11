
public class SecondLargestNumberInArray
{
	public static void main(String [] args)
	{
		int array1[] = {-3,51, 75, 28, 41, -67,99, 42};
		int firstLargest, secondLargest;
		 if(array1[0]>array1[1])
		 {
			 firstLargest = array1[0];	
			 secondLargest = array1[1];
			 System.out.println("First if condition");
			 /*System.out.println("firstLargest is: "+firstLargest);
			 System.out.println("secondLargest is: "+secondLargest);*/
		 }
		 else
		 {
			 firstLargest = array1[1];	
			 secondLargest = array1[0];
			 System.out.println("Second if condition");
			 /*System.out.println("firstLargest is: "+firstLargest);
			 System.out.println("secondLargest is: "+secondLargest);*/
		 }
		 for(int i=2;i<array1.length;i++)
		 {
			 if(array1[i]>firstLargest)
			 {
				 secondLargest = firstLargest;
				 firstLargest = array1[i];
			 }
		 }
		 System.out.println("firstLargest is: "+firstLargest);
		 System.out.println("secondLargest is: "+secondLargest);
	}
}

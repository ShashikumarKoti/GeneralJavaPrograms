
public class MissingNumberInArray
{
	public static void main(String[] args)
	{
		int range = 11;
		int [] a = {1, 4, 5, 2,3, 11, 10,8, 6,9}; //here 2 is missing

		int sumOfNumbers = sumOfNumbers(range);
		int sumOfElements = sumOfElements(a);
		int missingNumber = sumOfNumbers - sumOfElements;
		System.out.println("Missimg number is : "+missingNumber);
	}
	
	static int sumOfNumbers(int n)
	{
		int sum = (n*(n+1))/2;
		System.out.println("Sum of numbers: "+ sum);
		return sum;
	}
	static int sumOfElements(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements: "+ sum);
		return sum;
	}

}

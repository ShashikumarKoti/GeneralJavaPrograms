//All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number :
public class PairOfElementsInArray
{
	public static void main(String [] args)
	{
		int arr[] = {4, 6, 5, -10, 8, 5, 20};
		int sum = 10;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == sum)
				{
					System.out.println("Pairs are: "+arr[i]+" "+arr[j]);
				}
			}
		}
	}
}

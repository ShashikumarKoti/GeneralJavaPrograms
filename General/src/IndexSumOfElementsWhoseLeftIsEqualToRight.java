
public class IndexSumOfElementsWhoseLeftIsEqualToRight
{
	public static void main(String[] args)
	{
		int arr[] = {2,1,1,2,2,4};
		for(int i : arr)
		{
			System.out.print(+i+" ");
		}
		int index = findIndex(arr);
		System.out.println("Index is: " +index);
	}
	static int findIndex(int arr[])
	{
		int leftIndex = 0, rightIndex = arr.length-1;
		int leftSum = 0, rightSum = 0;
		while(leftIndex<=rightIndex)
		{
			if(leftSum>rightSum)
			{
				rightSum = rightSum + arr[rightIndex--];
			}else{
				leftSum = leftSum + arr[leftIndex++];
			}
		}
		if(leftSum == rightSum)
		{
			return rightIndex;
		}
		else
			return -1;
	}

}

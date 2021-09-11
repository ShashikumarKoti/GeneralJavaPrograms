
public class OccurenceOfNumberInCubeOfNumber
{
	public static void main(String[] args) 
	{
		long num = 1551;
		int occurence = 3;
		
		int x = calculateOccurence(num,occurence);
		System.out.println("cube of "+num+" is "+ num*num*num);
		System.out.println(x);

	}
	
	static int calculateOccurence(long num,int occurence)
	{
		long cube = num*num*num;
		int count = 0;
		while(cube>0)
		{
			if(cube%10==occurence)
			{
				count++;
			}
			cube = cube/10;
		}
		return count;
	}

}

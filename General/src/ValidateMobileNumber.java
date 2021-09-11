
public class ValidateMobileNumber
{
	public static void main(String[] args)
	{
		
		String i = "9916669765";
		if(isNumber(i) && (i.length() == 10))
		{
			System.out.println("Good..! it is a valid mobile number");
		}
		else{
			System.out.println("Le..correct mobile number type maadpa anna");
		}
	}
	
	static boolean isNumber(String num)
	{
		try{
		Double.parseDouble(num);		
		}catch(Exception e){return false;}
		return true;
	}

}

class Super
{
	 static void disp()
	{
		System.out.println("In super disp");
	}
	 
	 static void foo()
	 {
		 System.out.println("in super foo");
	 }
}
public class StaticOverride extends Super
{
	static void disp()
	{
		System.out.println("in sub disp");
	}
	static void foo()
	 {
		 System.out.println("in sub foo");
	 }
	public static void main(String [] args)
	{
		Super so = new StaticOverride();
		
		so.disp();
		so.foo();
	}
}

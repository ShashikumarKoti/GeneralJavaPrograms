import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesFromArrayList
{
	public static void main(String [] args)
	{
		ArrayList<String> ll = new ArrayList<String>();		 
        ll.add("JAVA"); 
        ll.add("J2EE"); 
        ll.add("JSP"); 
        ll.add("SERVLETS"); 
        ll.add("JAVA"); 
        ll.add("STRUTS"); 
        ll.add("JSP");
        System.out.println("With duplicates"+ ll);
        Set<String> set = new LinkedHashSet<String>(ll);
    	ArrayList<String> lll = new ArrayList<String>(set);	
    	System.out.println("Without duplicates"+ lll);
	}
}

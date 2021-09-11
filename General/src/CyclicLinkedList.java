//To find linked list is cyclic or not
public class CyclicLinkedList 
{
	public static void main(String [] args)
	{
		LinkedList ll = new LinkedList();
		ll.appendToTail(new LinkedList.Node("101"));
		ll.appendToTail(new LinkedList.Node("201"));
		ll.appendToTail(new LinkedList.Node("301"));
		ll.appendToTail(new LinkedList.Node("401"));
		System.out.println(ll);
		/*ll.appendToTail(new LinkedList.Node("101")); 
		LinkedList.Node cycle = new LinkedList.Node("201");
		ll.appendToTail(cycle);
		ll.appendToTail(new LinkedList.Node("301"));		
		ll.appendToTail(new LinkedList.Node("401")); 		
		ll.appendToTail(cycle);*/
		
		
		if(ll.isCyclic())
		{
			System.out.println("Linked List is cyclic as it contains cycles or loop"); 			
		}else
		{
			System.out.println("LinkedList is not cyclic, no loop or cycle found"); 
		}		
	}
}

class LinkedList
{
	private Node head;
	public LinkedList()
	{
		this.head = new Node("head");
	}
	public Node head()
	{
		return head;
	}
	public void appendToTail(Node node)
	{
		Node current = head;
		//find last element of LinkedList i.e. tail
		while(current.next()!= null)
		{
			current = current.next();
		}
		 //appending new node to tail in LinkedList
			current.setNext(node);
	}
	//isCyclic
	public boolean isCyclic()
	{
		Node fast = head;
		Node slow = head;
		
		while(fast!=null && fast.next !=null)
		{
			fast = fast.next.next;
			slow = slow.next;	
		
			if(fast == slow)
			{
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
	 StringBuilder sb = new StringBuilder();
	 Node current = head.next();
	 while(current != null)
	 {
		sb.append(current).append("-->");
		current = current.next();
	 } 
	 //sb.delete(sb.length() - 3, sb.length()); 
	 return sb.toString();
	 // to remove --> from last node return sb.toString(); }
	}
	 static class Node
	{
		Node next;
		private String data;
	
		public Node(String data)
		{
			this.data = data;
		}
		public String data()
		{
			return data;
		}
		public void setData(String data)
		{
			this.data = data;
		}
		public Node next()
		{
			return next;
		}
		public void setNext(Node next)
		{
			this.next = next;
		}
		public String toString() {
            return this.data;
        }
	}
}

/**
 *@author     Anurag Goel
 * Reverse Linked List  Iteration Method
 */
public class ReverseLinkedList{

	static class Node
	{
		int data;
		Node next;
	}
	
	/**
	 * Main Method
	 *
	 * @param      args  The args
	 */
	public static void main(String[] args) {
		Node head = new Node();
		head.data=1;
		Node node1 = new Node();
		node1.data=2;
		Node node2 = new Node();
		node2.data=3;
		Node node3 = new Node();
		node3.data=4;
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		printList(Reverse(head));
		
	}

/**
 * Reverse Linked List
 *
 * @param      head  The head
 */
	private static Node Reverse(Node head)
	{
		Node nextNode=null, temp=null;
	
		while(head!=null)
		{
			nextNode=head.next;
			head.next=temp;
			temp=head;
			head=nextNode;
		}
		return temp;

	}

	/**
 * Print All Elements of Linked List
 *
 * @param      Head of Linked List
 */
 public static void printList(Node node) {
  Node currentNode = node;
  while (currentNode != null) {
   System.out.println(currentNode.data);
   currentNode = currentNode.next;
  }
}

}

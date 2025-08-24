
class singlylinkedlist{
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	private Node head;
	
	public singlylinkedlist() {
		head = null;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		else {
			System.out.print("list : ");
			Node trav = head;
			while(trav != null) {
				System.out.print(trav.data+ " -> ");
				trav = trav.next;
			}
		}	
		System.err.println();
		System.err.println();
	}
	
	public void addlast(int val) {
		
		Node newnode = new Node(val);
		
		if (head == null) {
			head = newnode;
		}
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newnode;
				
		}
	}
	
	public void findloop() {
		Node slow = head , fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				System.out.println("loop is present in list");
			}
		}
		System.out.println("loop is not present in list");

	}
}

public class Program {

	public static void main(String[] args) {
		
singlylinkedlist list = new singlylinkedlist();
		
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(20);
		list.addlast(10);
		
		list.display();
		
		list.findloop();
		
	}

}

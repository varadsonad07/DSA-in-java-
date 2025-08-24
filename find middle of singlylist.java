
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
	
	public void findmiddle() {
		Node slow = head ; 
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow != null) {
			System.out.println("middle find : " +slow.data);
		}
	}
}

public class Program {

	public static void main(String[] args) {
		
		singlylinkedlist list = new singlylinkedlist();
		
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.addlast(50);
		list.addlast(60);
		list.addlast(70);
		list.addlast(80);
		list.addlast(90);

		
		list.display();
		
		list.findmiddle();
		
	}

}

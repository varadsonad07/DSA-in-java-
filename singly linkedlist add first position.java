
// first of all create a class as linkeslist
class linkeslist{
	
	// create a nested class as Node . Node is a nested class and a main class i.e 
	// outer class linkeslist is can access the private membes of nested class Node
	
	static class Node{
		private int data;
		private Node next;
		
		
	    // create a node 	
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	// create a head pointer  
	private Node head;
	
	public linkeslist() {
		head = null;
	}
	
	public void display() {
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data+ " -> ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void addlast(int val ) { 
		Node newNode = new Node(val);
		if(head == null ) {
			head = newNode;
		}
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}
	
	public void addfirst(int val) {
		//create new node 
		Node Newnode = new Node(val);
		
		// add first node to the next of Newnode
		Newnode.next = head;
		
		// make new node as first node 
		head = Newnode;
	}
}

public class Program {

	public static void main(String[] args) {

		linkeslist list = new linkeslist();
		
		System.out.println("add to last position");
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		
		list.display();
		System.out.println();
		
		System.out.println("add to first position");
		list.addfirst(5);
		list.addfirst(6);
		list.addfirst(7);
		list.addfirst(8);
		list.addfirst(9);
		
		list.display();
		
	}

}

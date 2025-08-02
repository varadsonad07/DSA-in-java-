
class Circularlinkedlist{
	
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
	
	public Circularlinkedlist() {
		head = null;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		Node trav = head;
		do {
			System.out.print(trav.data+ " -> ");
			trav = trav.next;
		}while(trav.next != head);
		System.out.println();
	}
	
	public void addlast(int val) {
		Node Newnode = new Node(val);
		
		if(head == null) {
			head = Newnode;
			Newnode.next = head;
		}
		else {
			Node trav = head;
			while(trav.next != head) {
				trav = trav.next;
			}
			Newnode.next = head;
			trav.next = Newnode;
		}
	}
	
	public void addfirst(int val) {
		Node Newnode = new Node(val);
		
		if(head == null) {
			head = Newnode;
			Newnode.next = head;
		}
		else {
			Node trav = head;
			while(trav.next != head) {
				trav = trav.next;
			}
			Newnode.next = head;
			trav.next = Newnode;
			head = Newnode;
		}
	}
	
	public void addATpos(int val , int pos) {
		if(head == null || pos <= 1) {
			addfirst(val);
		}
		else {
			Node Newnode = new Node(val);
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++) {
				if(trav.next == head) {
					return;
				}
				trav = trav.next;
			}
			Newnode.next = trav.next;
			trav.next = Newnode;
		}
	}
	
	public void deleteATlast() {
	
		if(head == null) {
			System.out.println("list is already empty");
		}
		if(head.next == null) {
			head = null;
			return;
		}
		else {
			Node prev = null;
			Node trav = head;
			while(trav.next != head) {
				prev = trav;
				trav = trav.next;
			}
			prev.next = head;
		}
	}
	
	public void deleteATfirst() {
		if(head == null) {
			System.out.println("list is already empty");
		}
		if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			while(trav.next != head) {
				trav = trav.next ;
			}
			head = head.next;
			trav.next = head;
		}
	}
	
	public void deleteAll() {
		head = null;
	}
}


public class Program {

	public static void main(String[] args) {
		Circularlinkedlist c = new Circularlinkedlist();
		
		System.out.println("add at last");
		c.addlast(10);
		c.addlast(20);
		c.addlast(30);
		c.addlast(40);
		c.display();
		
		System.out.println();
		System.out.println("add first ");
		c.addfirst(5);
		c.addfirst(6);
		c.display();
		
		System.out.println();
		System.out.println("add at pos");
		c.addATpos(8, 3);
		c.addATpos(9, 4);
		c.addATpos(11,  5);
		c.display();
		
		System.out.println();
		System.out.println("delete at last");
		c.deleteATlast();
		c.display();
		
		System.out.println();
		System.out.println("delete at first");
		c.deleteATfirst();
		c.deleteATfirst();
		c.display();
		
		System.out.println();
		System.out.println("delete all");
		c.deleteAll();
		c.display();
	}

}

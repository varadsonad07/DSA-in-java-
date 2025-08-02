// singly circular list using tail pointer insted of head pointer
// in this addfirst() , addlast() and deletefirst() has a O(1) time complexity 
// using tail insted of head is very easy and best time complexity
class singlycirculatlist{
	
	static class Node {
		private int data;
		private Node next;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	private Node tail;
	public singlycirculatlist() {
		tail = null;
	}
	
	public void display() {
		if(tail == null) {
			System.out.println("list is empty");
		} else {
			Node trav = tail.next; // Start from head
			do {
				System.out.print(trav.data + " -> ");
				trav = trav.next;
			} while(trav != tail.next); // Stop when we circle back to head
		}
	}
	
	public void addATfirst(int val) {
		Node Newnode = new Node(val);
		
		if(tail == null) {
			tail = Newnode;
			Newnode.next = tail;
		}
		else {
			Newnode.next = tail.next;
			tail.next = Newnode;
		}
	}
	
	public void addAtlast(int val) {
		Node Newnode = new Node(val);
		if(tail == null) {
			tail = Newnode;
			Newnode.next = tail;
		}
		else {
			Newnode.next = tail.next;
			tail.next = Newnode;
			tail = Newnode;
		}
	}
	
	public void deleteAtfirst() {
		if(tail == null) {
			System.out.println("list is empty");
		}
		if(tail.next == tail) {
			tail = null;
		}
		else {
			tail.next = tail.next.next;
		}
	}
}

public class Program {

	public static void main(String[] args) {
		
		singlycirculatlist c = new singlycirculatlist();
		
		System.out.println("add at first");
		c.addATfirst(10);
		c.addATfirst(20);
		c.addATfirst(30);
		c.display();
		
		System.out.println();
		System.out.println("add at last");
		c.addAtlast(40);
		c.addAtlast(50);
		c.addAtlast(60);
		c.display();
		
		System.out.println();
		System.out.println("delete at first");
		c.deleteAtfirst();
		c.deleteAtfirst();
		c.display();
		
		
	}
}

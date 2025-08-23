import java.util.Stack;


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
    	Node trav = head;
    	if(head == null) {
    		System.out.println("list is empty");
    		return;
    	}
    	else {
    		System.out.print("list : ");
	    	while(trav != null) {
	    		System.out.print(trav.data+ " -> ");
	    		trav = trav.next;
	    	}
    	}System.out.println();
    	System.out.println();
    }
    
    public void addlast(int val) {
    	Node newnode = new Node(val);
    	if(head == null) {
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
    
    // reverse singly linked list using a stack implementation 
    // time - O(n) , space - O(n)
    public void reverseorder() {
    	Stack<Integer> s = new Stack<>();
    	Node trav = head;
    	if(head == null) {
    		System.out.println("list is empty");
    		return;
    	}
    	else {
	    	while(trav != null) {
	    		s.push(trav.data);
	    		trav = trav.next;
	    	}
	    	while(!s.isEmpty()) {
	    		int val = s.pop();
	    		System.out.print(val+ " -> ");
	    	}
    	}
    }
    
    // reverse singly linked list using a recursion method
    // time - O(n) , space - O(n)
    public void reversedisplayrecursion(Node trav) {
    	if(trav == null) {
    		return;
    	}
    	reversedisplayrecursion(trav.next);
    	System.out.print(trav.data+ " -> ");
    }
    
    public void reversedisplayrecursion() {
    	reversedisplayrecursion(head);
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
		
		list.display();
		System.out.println("reverse a list using a stack implementation");
		list.reverseorder();
		
		System.out.println();
		System.out.println();
		System.out.println("reverse a list using recursion method");
		list.reversedisplayrecursion();
	}

}

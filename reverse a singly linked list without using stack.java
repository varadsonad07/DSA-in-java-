
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
    
    // reverse a list 
    public void reverselist() {
    	
    	// first check head.data because as reverse a list , head can be changed after a reverse a list
    	System.out.println("head before reverse a string : " +head.data);
    	

    	Node oldhead = head;
    	head = null;
    	
    	    	while(oldhead != null) {
    		Node temp = oldhead;
    		oldhead = oldhead.next;
    		temp.next = head;
    		head = temp;
    		
    	}
    	System.out.println("head after reverse a string : " +head.data);
    	System.out.println();
    }
}


public class Program {

	public static void main(String[] args) {

		singlylinkedlist list = new singlylinkedlist();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		
		list.display();
	
		list.reverselist();
		
		System.out.println("reverse a list");
		list.display();
		
	}

}

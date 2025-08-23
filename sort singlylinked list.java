
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
    
    // this sort using a selection sort technique
    public void selectionsortlist() {
    	if(head == null) {
    		System.out.println("list is empty");
    		return;
    	}
    	else{
    		for(Node i = head ; i != null ; i = i.next) {
    			for(Node j = i.next ; j != null ; j = j.next) {
    				if(i.data > j.data) {
    					int temp = i.data;
    					i.data = j.data;
    					j.data = temp;
    				}
    			}
    		}
    	}
    }
    
    // this sort using a bubble sort technique
    public void bubblesortlist() {
    	if(head == null) {
    		System.out.println("list is empty");
    		return;
    	}
    	else {
    			for(Node j = head ; j.next != null ; j = j.next) {
    				Node jn = j.next;
    				if(j.data > jn.data) {
    					int temp = j.data;
    					j.data = jn.data;
    					jn.data = temp;
    				}
    			}
    	}
    }
}

public class Program {

	public static void main(String[] args) {

		singlylinkedlist list = new singlylinkedlist();
		list.addlast(10);
		list.addlast(50);
		list.addlast(40);
		list.addlast(20);
		list.addlast(30);
		
		System.out.println("display without sort");
		list.display();
		
		System.out.println("display with selection sort");
		list.selectionsortlist();
		list.display();
		
		System.out.println("display with bubble sort");
		list.bubblesortlist();
		list.display();
	}

}

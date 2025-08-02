
class Doublylinkedlist{
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
			this.prev = null;
		}
	}
	
	private Node head;
	
	public Doublylinkedlist() {
		this.head = null;
	}
	
	public void frontdisplay() {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
		System.out.println("forward");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data+ " -> ");
			trav = trav.next;
		    }
		System.out.println();
		}
	}
	
	public void Reversedisplay() {
		System.out.println("reverse");
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
		    Node trav = head;
		    while(trav.next != null) {
		    	trav = trav.next;
			}
		    while(trav != null) {
		    	System.out.print(trav.data+ " <- ");
		    	trav = trav.prev;
		    } 
		}
		System.out.println();
	}
	
	public void addfirst(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void addlast(int val) {
		Node Newnode = new Node(val);
		if(head == null) {
			head = Newnode;
		}
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			Newnode.prev = trav;
			trav.next = Newnode;
		}
	}
	
	public void deletelast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			Node prev = null;
			while(trav.next != null) {
				prev = trav;
				trav = trav.next;
			}
			prev.next = null;
			
			// this is uisg one pointer its very simple 
			//trav.prev.next = null;
		}
	}
	
	public void deletefirst() {
		if(head == null) {
			System.out.println("list is empty");
		}
		if(head.next == null) {
			head = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}
	
	public void deleteatpos(int pos) {
		if(head == null || pos < 1) {
			System.out.println("list is empty");
			return;
		}
		if(pos == 1) {
			deletefirst();
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos ; i++) {
				if(trav == null) {
					break;
				}
				trav = trav.next;
			}
			Node travnext = trav.next;
			Node travprev = trav.prev;
			
			travprev.next = travnext;
			if(travnext != null) {
				travnext.prev = travprev;
			}
		}
		
		// this method is very easy to handle and its pointer is also one no need another pointer
//		else {
//			Node trav = head;
//			for(int i = 1 ; i < pos ; i++) {
//				if(trav == null) {
//					break;
//				}
//				trav = trav.next;
//			}
//			trav.prev.next = trav.next;
//			
//			if(trav.next != null) {
//			trav.next.prev = trav.prev;
//			}
//		}
	}
	
	public void addatpos(int val , int pos) {
		Node Newnode = new Node(val);
		
		if(head == null || pos < 1) {
			addfirst(val);
		}
		else {
			Node trav = head;
			Node prev = null;
			for(int i = 1 ; i < pos ; i++) {
				if(trav == null) {
					break;
				}
				prev = trav;
				trav = trav.next;
			}
			Newnode.next = trav;
			Newnode.prev = prev;
			prev.next = Newnode;
			if(trav != null) {
				trav.prev = Newnode;
			}
		}
	}
	
	public void deleteall() {
		head = null;
	}
}

public class Program {

	public static void main(String[] args) {
		
		Doublylinkedlist list = new Doublylinkedlist();
		
		System.out.println("add first :-");
		list.addfirst(10);
		list.addfirst(20);
		list.addfirst(30);
		list.frontdisplay();
		list.Reversedisplay();
		
		System.out.println();
		System.out.println("add at last :-");
		list.addlast(40);
		list.addlast(50);
		list.addlast(60);
		list.frontdisplay();
		list.Reversedisplay();
		
		System.out.println();
		System.out.println("delete first :- ");
		list.deletefirst();
		list.deletefirst();
		list.frontdisplay();
		list.Reversedisplay();
		
		System.out.println();
		System.out.println("delete at last :-");
		list.deletelast();
		list.deletelast();
		list.frontdisplay();
		list.Reversedisplay();
		
		System.out.println();
		System.out.println("add at position :-");
		list.addatpos(2, 2);
		list.addatpos(3, 3);
		list.frontdisplay();
		list.Reversedisplay();
		
		System.out.println();
		System.out.println("delete at pos :-");
		list.deleteatpos(2);
		list.deleteatpos(3);
		list.frontdisplay();
		list.Reversedisplay();
		
		System.out.println();
		System.out.println("delete all :-");
		list.deleteall();
		list.frontdisplay();
		list.Reversedisplay();
	}

}

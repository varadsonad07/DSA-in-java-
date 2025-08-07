import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Tree{
	static class Node{
		// create a node
		private int data;
		private Node left;
		private Node right;
		
		public Node(int val){
			data = val;
			// left and right are zero without declare in java 
		}
	}
	
	// declare globally to access in every function 
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	// display in preorder method
	public void displaypreorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			System.out.print(trav.data+ " , ");
			displaypreorder(trav.left);
			displaypreorder(trav.right);
		}
	}// we create a another parameterless displaypreorder
	// because private member of class cannot access in main function
	// this is same as all orders to print a data
	public void displaypreorder() {
		System.out.println("preorder");
		displaypreorder(root);
		System.out.println();
	}
	
	public void displayinorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			displayinorder(trav.left);
			System.out.print(trav.data+ " , ");
			displayinorder(trav.right);
		}
	}
	public void displayinorder() {
		System.out.println("inorder");
		displayinorder(root);
		System.out.println();
	}
	
	public void displaypostorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			displaypostorder(trav.left);
			displaypostorder(trav.right);
			System.out.print(trav.data+ " , ");	
		}
	}
	public void displaypostorder() {
		System.out.println("posrorder");
		displaypostorder(root);
		System.out.println();
	}
	
	// add node in tree
	
	public void add(int val) {
		Node newnode = new Node(val);
		
		if(root == null) {
			root = newnode;
		}
		else {
			Node trav = root;
			
			while(true){
				if(val < trav.data) {
					if(trav.left == null) {
						trav.left = newnode;
						break;
					}
				trav = trav.left;
				}
				else {
					if(trav.right == null) {
						trav.right = newnode;
						break;
					}
					trav = trav.right;
				}	
			}
		}
	}
	
	// search in binary search tree
	
	public void search(int val) {
		if(root == null) {
			System.out.println("there is no any single node to search i.e tree is empty");
		}
		
		Node trav = root;
		while(trav != null){
			if(trav.data == val){
				System.out.println("value is found " +trav.data);
				return;
			}
			else {
				if(val < trav.data) {
					trav = trav.left;
				}
				else {
					trav=trav.right;
				}
			}
	 	}
		System.out.println("value is not present in this tree");
	}		
	
	// we can search a node with its parent
	public void searchwithparent(int val) {
		if(root == null) {
			System.out.println("tree is empty");
			return;
		}
		Node trav = root;
		Node parent = null;
		
		while(trav!= null) {
			if(trav.data == val) {
				if(parent == null) {
					System.out.println(val+ " value is found");
				}
				else {
					System.out.println(val+" is found and its parent is " +parent.data);
				}
				return;
			}
			
			parent = trav;
			
			if(val < trav.data) {
				trav = trav.left;
			}
			else {
				// val >= trav.data; 
				trav = trav.right;
			}
		}
		System.out.println("value and its parent is not found in this tree");
	}
	
	// BFS search ( also calles as a level wise search )
	// because it can search as levelwise search
	public void BFS(int val) {
		// this is level wise searching 
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			Node trav = q.poll();
			System.out.print(trav.data+ " , ");
			
			if(val == trav.data) {
				System.out.println("value is found " +trav.data);
				return;
			}
			if(trav.left != null) {
				q.offer(trav.left);
			}
			if(trav.right != null) {
				q.offer(trav.right);
			}
		}
		System.out.println("value is not found at this tree");
	}
	
	// DFS search
	// this algo search node as greater or smaller 
  //this algo is better than BFS
	public void DFS(int val) {
		Stack<Node> s = new Stack<>();
		s.push(root);
		
		while(!s.isEmpty()) {
			Node trav = s.pop();
			System.out.print(trav.data+  " , " );
			
			if(trav.data == val) {
				System.out.println("value is found " +val);
				return;
			}
			if(val > trav.data) {
				if(trav.right != null) {
					s.push(trav.right);
				}
			}
			else {
				if(trav.left != null) {
					s.push(trav.left);
				}
			}
		}
		System.out.println("given node is not present in tree");
	}
	
}

public class BinarySearchTree {

	public static void main(String[] args) {
		Tree t = new Tree();
		
		Scanner sc = new Scanner(System.in);
		
		t.add(50);
		t.add(25);
		t.add(75);
		t.add(35);
		t.add(90);
		t.add(100);
		t.add(85);
		t.add(40);
		t.displaypreorder();
		t.displayinorder();
		t.displaypostorder();
		
		System.out.println();
		System.out.println("enter a key you want to search");
		int val1 = sc.nextInt();
		t.search(val1);
		
		
		System.out.println();
		System.out.println("enter a value search with a parent");
		int val2 = sc.nextInt();
		t.searchwithparent(val2);
		
		System.out.println();
		System.out.println("BFS search");
		System.out.println("enter a number to search in BFS");
		int val3 = sc.nextInt();
		t.BFS(val3);
		
		System.out.println();
		System.out.println("DFS search");
		System.out.println("enter a number search in DFS search");
		int val4 = sc.nextInt();
		t.DFS(val4);
		
	}

}

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Tree{
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int val){
			data = val;
			// left and right are zero without declare in java 
		}
	}
	
	// declare global 
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void displaypreorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			System.out.print(trav.data+ " , ");
			displaypreorder(trav.left);
			displaypreorder(trav.right);
		}
	}
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
		int key = sc.nextInt();
		t.search(key);
		
		
		System.out.println();
		System.out.println("enter a value search with a parent");
		int val = sc.nextInt();
		t.searchwithparent(val);
		
		System.out.println();
		System.out.println("BFS search");
		t.BFS(val);
		
	}

}

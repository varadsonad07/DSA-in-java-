// create class name as tree
class tree{

  // create nested class to access all private members in nested class
	static class Node{
		private int data;
		private Node left;
		private Node right;

    // in binary search tree we have a 3 pointers same as a doubly linkes list
		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}
	private Node root;
	
	public tree() {
		root = null;
	}

  // print elements in inorder 
	public void DisplayinPreorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			System.out.print(trav.data+ " , ");

      //  here use a recursive method
			DisplayinPreorder(trav.left);
			DisplayinPreorder(trav.right);
		}
	}
  // create a parameterless to call in main function
	public void DisplayinPreorder() {
		System.out.println("preorder");
		DisplayinPreorder(root); //  call DisplayinPreorder(Node trav)
		System.out.println();
	}
	
	public void DisplayinInorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
      //  here use a recursive method
			DisplayinInorder(trav.left);
			System.out.print(trav.data+ " , ");
			DisplayinInorder(trav.right);
			
		}
	}
	public void DisplayinInorder() {
		System.out.println("inorder");
		DisplayinInorder(root);
		System.out.println();
	}
	
	public void DisplayinPostorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
      //  here use a recursive method
			DisplayinPostorder(trav.left);
			DisplayinPostorder(trav.right);
			System.out.print(trav.data+ " , ");
		}
	}
	public void DisplayinPostorder() {
		System.out.println("postorder");
		DisplayinPostorder(root);
		System.out.println();
	}
	
	public void add(int val) {
		Node newnode = new Node(val);
		
		if(root == null) {
			root = newnode;
		}
		else {
			Node trav = root;
			while(true) {
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
}


public class Program {

	public static void main(String[] args) {

		tree t = new tree();
		t.add(50);
		t.add(25);
		t.add(75);
		t.DisplayinPreorder();
		t.DisplayinInorder();
		t.DisplayinPostorder();
	}

}

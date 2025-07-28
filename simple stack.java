

class Simple_stack{
	
	private int[] arr;
	private int top;
	
	public Simple_stack(int size) {
		top = -1;
		arr = new int[size];
	}
	
	public int push(int val) {
		top++;
		arr[top] = val;
		return val;
	}
	
	public int pop() {
		int val = arr[top];
		top--;
		return val;
	}
	
	public int peek() {
		int val = arr[top];
		return val;
	}
	
	public boolean isFull() {
		return top == arr.length - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("stack is empty ");
			return;
		}
		
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
	
}


public class Program {

	public static void main(String[] args) {
		
		Simple_stack s = new Simple_stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.display();
		
		while (! s.isEmpty()) {
		int ele = s.pop();
		System.out.println("popped element is : " +ele);
		}
		
		s.display();
	}
}

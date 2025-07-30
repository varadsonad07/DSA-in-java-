import java.util.Stack;

class QueueusingStack{
	Stack <Integer> main = new Stack<>();
	Stack <Integer> temp = new Stack<>();
	
	public void push(int val) {
		while(!main.isEmpty()) {
			temp.push(main.pop());
		}
		main.push(val);
		while(!temp.isEmpty()) {
			main.push(temp.pop());
		}
	}
	
	public void pop() {
		System.out.println("queue using stack is : ");
		while(!main.isEmpty()) {
			System.out.print(main.pop()+ "  ");
		}
	}
}

public class Program {

	public static void main(String[] args) {
		
		QueueusingStack q = new QueueusingStack();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		
		q.pop();
		
	}

}

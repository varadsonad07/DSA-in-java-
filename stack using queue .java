import java.util.LinkedList;
import java.util.Queue;

class stackusingqueue{
	
	Queue<Integer> main = new LinkedList<>();
	Queue<Integer> temp = new LinkedList<>();
	
	public void push(int val) {
		
		while(! main.isEmpty()) {
			temp.offer(main.poll());
		}
		main.offer(val);
		
		while(! temp.isEmpty()) {
			main.offer(temp.poll());
		}
	}
	public void poll() {
		while(! main.isEmpty()) {
		System.out.print(main.poll()+ "  ");
		}
	}
}

public class Program {
	
	public static void main(String[] args) {
		stackusingqueue s = new stackusingqueue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("stack using queue is : ");
		
		s.poll();

	}

}

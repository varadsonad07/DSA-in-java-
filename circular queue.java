// in circular queue it can solve the problem of push .
// when a push (i.e rear can push upto arr.length and again we can push one element and at first position of array . the space is available it can pushed element at first index )
class linearque{
	
	private int [] arr;
	private int front , rear;

public linearque(int size) {
	arr = new int[size];
	front = -1;
	rear = -1;
}

public int push(int value) {
	rear = (rear + 1 ) % arr.length;
	arr[rear] = value;
	return value;
}

public int pop() {
	front = (front + 1 ) % arr.length;
	int value = arr[front]; 
	
	if(front == rear ) {
		front = -1;
		rear = -1;
	}
	return value;
}

public int peek() {
	
	int i = (front + 1) % arr.length;
	int value = arr[i];
	return value;
	
}

public boolean isFull() {

	if((front == rear && front != -1) || (front == -1 && rear == arr.length -1)) 
		return true;
	else
		return false;
}


public boolean isEmpty() {
	     if(front == rear && front == -1) 
	    	 return true;
	     
	     else
	    	 return false;
}

public void display() {
    if (front == rear) {
        System.out.println("Queue is empty.");
        return;
    }

    System.out.print("Queue elements: ");
    for (int i = front + 1; i <= rear; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

}

public class Program {

	public static void main(String[] args) {

		linearque l = new linearque(6);
		l.push(10);
		l.push(20);
		l.push(30);
		l.display();
		
		l.pop();
		l.pop();
		l.pop();
		l.display();
		
		l.push(40);
		l.push(50);
		l.push(60);
		l.push(70);
		l.push(80);
		l.push(90);
		l.display();
		
		int val = l.peek();
		System.out.println("next element of front is : " +val);
		
		if( l.isFull()) {
			System.out.println("queue is full");
		}
		else {
			System.out.println("queue is not full");
		}
		
		while(! l.isEmpty()) {
			int ele = l.pop();
			System.out.println("  popped element is : " +ele);
		}
		
		if(l.isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			System.out.println("queue if full");
		}
	}

}

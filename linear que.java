
// linear queue is not a suitable for anyone programming 
// it has a problem with a push a element 
// when queue is empty but it cant add element because rear of queue is reach at max-1
// solution of this problem is circular queue  
// when in circular queue of rear is reached at max -1 and we can perform a pop operation and again we can push the element  rear is transfer at 0th index and element is add also
// so preffer a circular queue 

package com.sunbeam;

class linearque{
	
	private int [] arr;
	private int front , rear;

public linearque(int size) {
	arr = new int[size];
	front = -1;
	rear = -1;
}

public int push(int value) {
	rear ++;
	arr[rear] = value;
	return value;
}

public int pop() {
	front ++;
	int value = arr[front]; 
	return value;
}

public int peek() {
	
	int value = arr[front + 1];
	return value;
	
}

public boolean isFull() {
		if(rear == arr.length - 1)
			return true;
		else
			return false;	
}

public boolean isEmpty() {
	     if(front == rear) 
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
		l.display();
		
		l.push(40);
		l.push(50);
		l.push(60);
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

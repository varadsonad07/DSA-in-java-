package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class reversestack{
	Stack <Integer> s = new Stack<>();

     public void reverse_stack(int[] arr) {

    	 System.out.println("original list is :");
    	  for(int i = 0 ; i < arr.length ; i++) {
  			System.out.print(s.push(arr[i])+ "  ");
  		}
    	 System.out.println();
    	 
    	 // just pop the element it can store in array and print array  reverse element
    	  System.out.println("reverse array using stack is :"); 
    	  for(int j = 0 ; j < arr.length ; j++) {
    		  arr[j] = s.pop();
    		  System.out.print(arr[j] + "  ");
    	  }
    	  System.out.println();
     }
}

class reversequeue {
    Queue<Integer> q = new LinkedList<>();

    public void reverse_queue(int[] arr) {
        Stack<Integer> tempStack = new Stack<>();

        System.out.println("Original queue is:");
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 1: Move all elements from queue to stack
        while (!q.isEmpty()) {
            tempStack.push(q.poll());
        }

        // Step 2: Move all elements back to queue (now reversed)
        while (!tempStack.isEmpty()) {
            q.offer(tempStack.pop());
        }

        System.out.println("Reversed queue is:");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }
}


public class Program {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5};
		
		reversestack rs = new reversestack();
		rs.reverse_stack(arr);
		
		reversequeue rq = new reversequeue();
		rq.reverse_queue(arr);
		
	}

}

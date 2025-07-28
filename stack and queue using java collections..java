package com.sunbeam;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("topmost elemet is stack is : " +s.peek());
		
		while(! s.isEmpty()) {
			int ele = s.pop();
			System.out.println("popped elemet is : " +ele);
		}
		
		s.push(50);
		
		if(s.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("not empty");
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		while(! q.isEmpty()) {
			int ele = q.poll();
			System.out.println("popped elemet is : " +ele);
		}
		if(q.isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			System.out.println("not empty");
		}
	}

}

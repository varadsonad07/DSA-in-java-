package com.sunbeam;

public class TimeComplexity {

	// here we can calculate the factorial of any number and analyze the complexity
	// time complexity = O(n) because the loop is run N times 
	// space complexity = O(1) 
	public static void  factorial(int n) {
		int i , r = 1;
		for(i = 1 ; i <= n ; i++ ) {
			r = r * i;
		}
		System.out.println("factorial of  " + n + " is " +r);
	}
	
	// here we can display 2D matrix
	// time complexity = O(n^2) because the loop is run N * N times
	// space complexity = O(n^2) 
	public static void displayMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	
	// here we can print the table of any number
	// time complexity = O(1)
	// space complexity = O(1)
	public static  void Table(int number) {
		int table = 1;
		for(int i = 1 ; i <= 10 ; i++) {
			table = i * number;
			System.out.println(table);
		}
		System.out.println();
	}
	
	// here we can convert a number to binary 
	// time complexity = O(log n) // because in logic there are a multiple division is occur then the complexity is O(log n)
	// space complexity = O(1)
	public static void NumberTOBinary(int n) {
		while(n > 0) {
			int r = n % 2;
			System.out.print(r);
			n = n / 2;	
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// factorial
		factorial(4);
		
		//2D matrix 
		int[][] mat = {{1,2,3} , {4,5,6} , {7,8,9}};
		displayMatrix(mat);
		
		// print table
		Table(10);
		
		// number to binary
		NumberTOBinary(10);
		
	}

}

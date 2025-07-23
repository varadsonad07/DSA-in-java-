package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static int binarysearch(int[] arr , int key , int l , int r) {
		
		if(l > r ) {
			return -1;
		}
		int m = (l + r) / 2;
		int index;
		if(key == arr[m]) {
			return m;
		}
		if(key < arr[m]) {
			
			 index = binarysearch(arr, key, l, m-1);
		}
		else {
			 index = binarysearch(arr, key, m+1, r);
		}
		return index;

	}
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int[] arr = {11,22,33,44,55,66,77};
		System.out.println("enter a key for search");
		int key = sc.nextInt();
		int index = binarysearch(arr , key , 0 , arr.length-1);
		
		if(index != -1) {
		
			System.out.println(key+ " is found at index " +index);
		}
		
	}
}

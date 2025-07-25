package com.sunbeam;

public class Pogram {

	public static void InsertionSort(int[] arr) {
		int i , j;
		for(i = 1 ; i < arr.length ; i++) {
			int temp = arr[i];
			for(j = i - 1 ; j >= 0 && arr[j] > temp ; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		
	}
	
	public static void printarray(int [] arr) {
		for(int i = 0 ; i <= arr.length - 1 ; i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int [] arr = {1 , 5, 3, 6, 2};
		
		System.out.println("before sorting : ");
		printarray(arr);
		
		InsertionSort(arr);
		
		System.out.println("after sorting : ");
		printarray(arr);

	}

}

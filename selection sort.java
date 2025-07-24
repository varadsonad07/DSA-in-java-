package com.sunbeam;

public class Program {

	public static void SelectionSort(int[] arr) {
		// select the ith elem
				for (int i = 0; i < arr.length-1; i++) {
					// compare with all elems after that
					for (int j = i+1; j < arr.length; j++) {
						// if ith is more than jth elem, swap them
						if(arr[i] > arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		       int[] arr = {5, 6, 3, 8, 2, 4};
				System.out.print("Before Sort: "); 
				printArray(arr);
				SelectionSort(arr);
				System.out.print("After Sort: "); 
				printArray(arr);

	}

}

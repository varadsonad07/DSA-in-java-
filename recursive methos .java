package com.sunbeam;
import java.util.Scanner;
public class Program {

	// calculate a factorial for a given number
	public static int factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		int fact = n * factorial(n - 1);
		
		return fact;
	}
	
	// calculate a power of given number
	public static int power(int x , int y) {
	
		if(y == 0) {
			return 1;
		}
		
		int result = x * power (x , y -1);
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int res = factorial(5);
		System.out.println("factorial is " +res);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int power_res = power(x, y);
		System.out.println("power calculating   " +x+ "^" +y+ "is :"+power_res);
	}

}

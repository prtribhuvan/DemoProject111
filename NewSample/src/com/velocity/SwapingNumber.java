package com.velocity;

import java.util.Scanner;

public class SwapingNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter two number");
		
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b =scanner.nextInt();
		
		System.out.println("before swapping");
		System.out.println("a = "+ a + " b = "+ b);
		
		a = a+b;
		b=a-b;
		a= a-b;
		System.out.println("a = "+ a + " b = "+ b);

	}

}

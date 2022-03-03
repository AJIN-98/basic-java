package com.exm;

import java.util.Scanner;

public class Max {
	public void maximum(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(b + " is greater");
		}
	}

	public static void main(String[] args) {
	
		// final float pi =  3.14f; 
		
		Max obj = new Max();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		sc.close();
		obj.maximum(a, b);
	}
}
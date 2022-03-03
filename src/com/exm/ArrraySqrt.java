package com.exm;

import java.util.Scanner;

public class ArrraySqrt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double store[] = new Double[5];

		System.out.println("enter 5 numbers :");
		for (int i = 0; i < 5; i++) {
			store[i] = sc.nextDouble();
			store[i] = Math.sqrt(store[i]);
		}
		
		System.out.println("sqrt of 5 numbers :");
		for (int i = 0; i < 5; i++) {
			System.out.println(store[i]+"    ");
		}

	}

}

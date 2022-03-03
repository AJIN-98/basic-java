package com.assignment;

import java.util.Scanner;

// write a program to input an array and display the content in reverse order??

public class Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("array size :");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.print("Enter the elements : ");

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = size - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		sc.close();
	}

}

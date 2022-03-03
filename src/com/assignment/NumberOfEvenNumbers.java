package com.assignment;

import java.util.Scanner;

public class NumberOfEvenNumbers {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("array size :");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.print("Enter the elements : ");

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();

			if (numbers[i] % 2 == 0) {
				count++;
			}
		}
		sc.close();

		System.out.println("Number of even numbers  :" + count);

	}

}

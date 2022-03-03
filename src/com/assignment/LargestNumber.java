package com.assignment;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("array size :");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.print("Enter the elements : ");

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int max = numbers[0];
		for (int i = 0; i < size; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("largest number is :" + max);

	}

}

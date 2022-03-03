package com.assignment;
import java.util.Scanner;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("array size :");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.print("Enter the elements : ");

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();

			if (numbers[i] > 0) {
				sum = sum + numbers[i];
			}
		}
		sc.close();

		System.out.println("Sum of positive numbers :" + sum);

	}

}

package com.exm;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int marks[][]=  new int[4][3]; // marks[4][3]    marks[i][j]
		
		System.out.println("enter the elements for 4x3 matrix ");
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				marks[i][j] =sc.nextInt();
			}
		}
		System.out.println("output is :");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

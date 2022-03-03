package com.exm;

import java.util.Scanner;

public class Sales {

	public void SalesCalulation(float[] salesData) {
		float total = 0;
		float average = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			total = total + salesData[i];
		}
		sc.close();
		average = total / 7;
		System.out.println("total sales :" + total + " Rs");
		System.out.println("average of sales :" + average + " Rs");

	}

	public static void main(String[] args) {

		float salesData[] = new float[] { 200, 300, 400, 500, 600, 700, 800 };

		Sales obj = new Sales();
		obj.SalesCalulation(salesData);

	}

}

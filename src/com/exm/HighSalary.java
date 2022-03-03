package com.exm;

public class HighSalary {

	public static void main(String[] args) {
		int count = 0;
		float employeeSalary[] = new float[] { 1000000, 200000, 10000, 20001, 3223200 };

		for (int i = 0; i < 5; i++) {
			if (employeeSalary[i] > 100000) {
				count++;
			}
		}
		System.out.println("count is :" + count);
		
		// length of an array
		
		System.out.println("length of array :"+employeeSalary.length);
	}

}

package com.assignment;

public class Frequency {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 3, 2, 1, 1, 3, 4, 5 };
		int visited = -1;
		int[] frq = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					frq[j] = visited;
				}
			}

			if (frq[i] != visited)
				frq[i] = count;
		}
		
		System.out.println("  Element | Frequency");
		System.out.println("------------------------");
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] != visited)
				System.out.println("     " + numbers[i] + "    |    " + frq[i]+"      ");
		}
	}

}

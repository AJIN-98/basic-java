package com.exm;

import java.util.Scanner;

class Pdm {
	public static void main(String args[]) {
		String s1 = "yes";
		String s2 = "yes";
		String s3 = new String(s1);
		
		if(s1==s2) {
			System.out.println("true 1");
		}
		 if(s3==s1) {
			System.out.println("true 2");
		}
		if(s1.equals(s2)) {
			System.out.println("true 3");
		}
		if(s3.equals(s1)) {
			System.out.println("true 4");
		}
		
	}
	
}

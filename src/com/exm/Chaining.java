package com.exm;

import java.util.Scanner;

public class Chaining {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(); // buffer initialized
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("enter the string : ");
		String input = sc.next();	//reading input string from user
		
		sb.append(input);	//appending string to buffer sb
		
		String temp = sb.toString(); //copying buffer content as string to temp
		
		String reverse = sb.reverse().toString(); //reversing buffer and storing it as a string to reverse
		
		if(temp.equalsIgnoreCase(reverse)) { //comparing reverse and temp
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}

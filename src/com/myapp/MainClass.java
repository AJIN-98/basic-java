package com.myapp;

public class MainClass {
	
	public static void main(String[] args) {
				
		byte b =5; //primitive
		double mark = 5.0; // primitive data type
		
		System.out.println("primitive values :");
		System.out.println(b);
		System.out.println(mark);
		
		
		Byte wb = new Byte(b); // wrapper 
		Double wmark = new Double(mark); //wrapper 
		
		System.out.println("wrapper values :");
		System.out.println(wb.byteValue());
		System.out.println(wmark.doubleValue());
	
		
		
		
		
	}

}

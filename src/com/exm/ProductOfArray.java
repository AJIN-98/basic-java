package com.exm;

import java.util.Scanner;

public class ProductOfArray {

	public static void main (String args[])
	{
		
	Scanner sc =new Scanner(System.in);
	System.out.print("enter the size of arrays :");
	int size=sc.nextInt();

	int array1[]=new int[size];

	int array2[]=new int[size];

	System.out.println("enter the elements for array1");

	for(int i=0;i<size;i++)
	{
	array1[i]=sc.nextInt();
	}

	System.out.println("enter the elements for array2");


	for(int i=0;i<size;i++)
	{
	array2[i]=sc.nextInt();
	}


	for(int i=0;i<size;i++)
	{
	array1[i]=array1[i]*array2[i];
	}

	System.out.print("product of two arrays :[ ");

	for(int i=0;i<size;i++)
	{
	System.out.print(array1[i]+" ");
	}
	System.out.print("]");
	}

}

package com.cts.exception;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {0,1,2,3};
		
		System.out.println("hi");
		
		try {
			System.out.println("Array length should be 10");
		System.out.println(array[10]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("bye");

	}
}

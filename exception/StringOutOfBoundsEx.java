package com.cts.exception;

public class StringOutOfBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="raju";
		System.out.println("hi");
		try {
			System.out.println("String length should be 10");
		System.out.println(s.charAt(10));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("bye");
	}

}

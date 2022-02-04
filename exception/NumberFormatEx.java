package com.cts.exception;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
		try {
			String s="123abc";
			System.out.println("input must be Integer");
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		//System.out.println("hello");
		finally {
			System.out.println("hello");
		}
		/*catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		System.out.println("bye");
	}

}

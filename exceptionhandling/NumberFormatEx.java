package com.cts.exceptionhandling;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String num="123abc";
			int i=Integer.parseInt(num);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			
			System.out.println(e);
			
		}
		
		System.out.println("rest of the code");
	}

}

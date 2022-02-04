package com.cts.exceptionhandling;

public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int i=50/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			//System.out.println("rest of the code");
		}

		System.out.println("rest of the code");
	}

}

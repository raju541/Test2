package com.cts.exception;

public class ExcetionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		try {
			String s="123";
			System.out.println("input must be Integer");
			int i=Integer.parseInt(s);
			System.out.println(i);
		System.out.println(10/0);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		/*catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			
		}*/
		System.out.println("hi");
		
		
		
		
		
		
		
		
		
	}

}

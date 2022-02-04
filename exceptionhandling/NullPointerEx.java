package com.cts.exceptionhandling;

public class NullPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			 String s=null; 
			 System.out.println(s.charAt(10));
			 
			}
		catch (NullPointerException e) {
				
			System.out.println(e);
			
			}	
		System.out.println("rest of the code");
	}

}

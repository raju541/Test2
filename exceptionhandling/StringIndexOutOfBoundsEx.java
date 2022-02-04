package com.cts.exceptionhandling;

public class StringIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String s="raju";
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("rest of the code");

	}

}

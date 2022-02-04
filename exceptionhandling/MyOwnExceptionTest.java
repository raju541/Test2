package com.cts.exceptionhandling;

public class MyOwnExceptionTest {

	public static void main(String[] args) throws MyOwnException{
		// TODO Auto-generated method stub
		
		try {
			String s="123a";
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
			throw new MyOwnException("input must be Integer");
			
		}

	}

}

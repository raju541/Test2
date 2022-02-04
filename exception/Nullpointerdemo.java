package com.cts.exception;

public class Nullpointerdemo {
	public void m1() {
		System.out.println("hi");
	}

	public static void main(String[] args) throws Ourownexception {
		// TODO Auto-generated method stub
		Nullpointerdemo nullpointerdemo=new Nullpointerdemo();
		nullpointerdemo.m1();
		nullpointerdemo=null;
		try {
		nullpointerdemo.m1();
		}
		
		
		catch(Exception e) {
			throw new Ourownexception("shold not be null");
			
		}
		finally {
			
		}
		System.out.println("bye");
		
	
	}

}

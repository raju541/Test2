package com.cts.exceptionhandling;

public class MyOwnException extends Exception {
	
	private String msg;
	
	public MyOwnException() {}
	public MyOwnException(String msg) {
		
		this.msg=msg;
		System.out.println(msg);
	}

}

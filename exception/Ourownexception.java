package com.cts.exception;

public class Ourownexception extends Exception {
String msg;
	
	public Ourownexception(String msg){
		
		this.msg=msg;
		 getMsg();
		
	}

	public String getMsg() {
		System.out.println(msg);
		return msg;
	}
	
}

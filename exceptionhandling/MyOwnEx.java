package com.cts.exceptionhandling;

public class MyOwnEx extends Exception {
	
	private String msg;
	
	public MyOwnEx() {}
	public MyOwnEx(String msg) {
		
		this.msg=msg;
		System.out.println(msg);
	}
	
	public String getMsg()
	{
		return msg;
	}
	public void setMsg(String msg)
	{
		this.msg=msg;
	}

}

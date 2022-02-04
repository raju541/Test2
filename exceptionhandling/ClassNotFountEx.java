package com.cts.exceptionhandling;

public class ClassNotFountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.cts.exceptionhandling.MyException");
		
		ClassLoader.getSystemClassLoader().loadClass("com.cts.exceptionhandling.MyException");
		ClassLoader.getPlatformClassLoader().loadClass("com.cts.exceptionhandling.MyException");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}




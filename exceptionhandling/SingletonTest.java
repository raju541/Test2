package com.cts.exceptionhandling;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass s1=SingletonClass.getSingleton();
		SingletonClass s2=SingletonClass.getSingleton();
		if(s1==s2) {
			System.out.println("Singleton");
		}
		else
			System.out.println("not a Singleton");

	}

}

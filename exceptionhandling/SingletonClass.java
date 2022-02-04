package com.cts.exceptionhandling;

public class SingletonClass {
	
	private static SingletonClass object=null;
	
	private  SingletonClass()	{}
	
	public static SingletonClass getSingleton()
	{
		if(object==null)
		{
			synchronized (SingletonClass.class) {
			if(object==null)
			{
				object=new SingletonClass();
			}
			}
		}
		return object;
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass s1=SingletonClass.getSingleton();
		SingletonClass s2=SingletonClass.getSingleton();
		if(s1==s2) {
			System.out.println("Singleton");
		}
		else
			System.out.println("not a Singleton");

	}*/
}

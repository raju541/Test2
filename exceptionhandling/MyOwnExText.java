package com.cts.exceptionhandling;

public class MyOwnExText {
	
		public void add(String a,String b) throws MyOwnEx
		{
			try {
				int x=Integer.parseInt(a);
				int y=Integer.parseInt(b);
				x=x+y;
				System.out.println(x);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw new MyOwnEx("Input must be Integer");
			}
		}

	public static void main(String[] args) throws MyOwnEx {
		// TODO Auto-generated method stub
		MyOwnExText mt=new MyOwnExText();
		mt.add("5", "5b");
	}

}

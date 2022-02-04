package com.cts.exceptionhandling;

public class CustomException extends Exception {

		private String msg;
		public CustomException() {}
		public CustomException(String msg) {
			this.msg=msg;
			System.out.println(msg);
		}
	public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			String s="123ab";
			int i=Integer.parseInt(s);
			System.out.println(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
			throw new CustomException("input must be an integer");
	}

}

package com.cts.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> list=new Stack<String>();
		list.push("abc");
		list.push("xyz");
		list.push("klm");
		list.push("xyz");
		list.pop();
		System.out.println("peek element: "+list.peek());
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		/*for (Emp e : list) {
			System.out.println(e.getEid()+" "+e.getEmpname());
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEid()+" "+list.get(i).getEmpname());
		}*/
	}

}

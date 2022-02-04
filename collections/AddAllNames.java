package com.cts.collections;

import java.util.*;

public class AddAllNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Good Morning");
		Collections.addAll(list, "How Are You?" , "Thanks You!");
		System.out.println(list);
		
		String s[]= {"Welcome","Bye"};
		Collections.addAll(list, s);
		System.out.println(list);
		

	}

}
